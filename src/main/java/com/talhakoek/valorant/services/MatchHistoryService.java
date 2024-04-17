package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
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
@ApplicationScoped
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
    MatchHistoryResponse matchHistoryResponse;

    public MatchHistoryResponse getMatchHistory(String PUUID) throws Exception {//+ "?endIndex=1"
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://pd.eu.a.pvp.net/match-history/v1/history/" + PUUID))
                .header("X-Riot-ClientPlatform", "ew0KCSJwbGF0Zm9ybVR5cGUiOiAiUEMiLA0KCSJwbGF0Zm9ybU9TIjogIldpbmRvd3MiLA0KCSJwbGF0Zm9ybU9TVmVyc2lvbiI6ICIxMC4wLjE5MDQyLjEuMjU2LjY0Yml0IiwNCgkicGxhdGZvcm1DaGlwc2V0IjogIlVua25vd24iDQp9")
                .header("X-Riot-ClientVersion", "release-08.07-shipping-9-2444158")
                .header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT())
                .header("Authorization", playerHistory.getAuthorization())
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        matchHistoryResponse = mapper.readValue(response.body(), MatchHistoryResponse.class);


        int numThreads = matchHistoryResponse.getHistory().size();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads); // Creating a thread pool
        CountDownLatch latch = new CountDownLatch(numThreads); // Latch for waiting all threads to complete

        for (int i = 0; i < numThreads; i++) {
            final int index = i;
            executor.submit(() -> {
                try {
                    matchHistoryResponse.getHistory().get(index).setMatchDetailsResponse(service.getMatchDetails(matchHistoryResponse.getHistory().get(index).getMatchID()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    latch.countDown(); // Decrease count on latch
                }
            });
        }

        latch.await(); // Wait for all threads to finish
        executor.shutdown(); // Shutdown the executor service
        System.out.println(Thread.activeCount());

        return matchHistoryResponse;

    }
}
