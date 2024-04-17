package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
import com.talhakoek.valorant.models.CompetitiveUpdates;
import com.talhakoek.valorant.models.CurrentRank;
import com.talhakoek.valorant.models.MatchHistoryResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Named
@RequestScoped
public class MatchHistoryService {

/*
    private static final Map<String, String> regionToShard = Map.of(
            "latam", "na",
            "br", "na",
            "na", "na",
            "eu", "eu",
            "ap", "ap",
            "kr", "kr"
    );*/

    @Inject
    PlayerHistory playerHistory;
    @Inject
    private MatchDetailsService service;
    CompetitiveUpdates competitiveUpdates;

    public CompetitiveUpdates getMatchHistory(String PUUID) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pd.eu.a.pvp.net/mmr/v1/players/"+PUUID+"/competitiveupdates"))
                .header("X-Riot-ClientPlatform", "ew0KCSJwbGF0Zm9ybVR5cGUiOiAiUEMiLA0KCSJwbGF0Zm9ybU9TIjogIldpbmRvd3MiLA0KCSJwbGF0Zm9ybU9TVmVyc2lvbiI6ICIxMC4wLjE5MDQyLjEuMjU2LjY0Yml0IiwNCgkicGxhdGZvcm1DaGlwc2V0IjogIlVua25vd24iDQp9")
                .header("X-Riot-ClientVersion", "release-08.07-shipping-9-2444158")
                .header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT())
                .header("Authorization", playerHistory.getAuthorization())
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        competitiveUpdates = mapper.readValue(response.body(), CompetitiveUpdates.class);


        int numThreads = competitiveUpdates.getMatches().size();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads); // Creating a thread pool
        CountDownLatch latch = new CountDownLatch(numThreads); // Latch for waiting all threads to complete

        for (int i = 0; i < numThreads; i++) {
            final int index = i;
            executor.submit(() -> {
                try {
                    competitiveUpdates.getMatches().get(index).setMatchDetailsResponse(service.getMatchDetails(competitiveUpdates.getMatches().get(index).getMatchID()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    latch.countDown(); // Decrease count on latch
                }
            });
        }

        latch.await(); // Wait for all threads to finish
        executor.shutdown(); // Shutdown the executor service
        return competitiveUpdates;

    }

    public CurrentRank getCurrentRank(String PUUID) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pd.eu.a.pvp.net/mmr/v1/players/"+PUUID+"/competitiveupdates?queue=competitive&startIndex=0&endIndex=1"))
                .header("X-Riot-ClientPlatform", "ew0KCSJwbGF0Zm9ybVR5cGUiOiAiUEMiLA0KCSJwbGF0Zm9ybU9TIjogIldpbmRvd3MiLA0KCSJwbGF0Zm9ybU9TVmVyc2lvbiI6ICIxMC4wLjE5MDQyLjEuMjU2LjY0Yml0IiwNCgkicGxhdGZvcm1DaGlwc2V0IjogIlVua25vd24iDQp9")
                .header("X-Riot-ClientVersion", "release-08.05-shipping-20-2431885")
                .header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT())
                .header("Authorization", playerHistory.getAuthorization())
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        CompetitiveUpdates temp = mapper.readValue(response.body(), CompetitiveUpdates.class);

        return new CurrentRank(temp.getMatches().get(0).getRankedRatingAfterUpdate(),temp.getMatches().get(0).getTierAfterUpdate());

    }
}
