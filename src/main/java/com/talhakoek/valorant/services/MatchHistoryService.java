package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
import com.talhakoek.valorant.models.MatchHistoryResponse;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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


    public MatchHistoryResponse getMatchHistory(String PUUID) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://pd.eu.a.pvp.net/match-history/v1/history/" + PUUID)).header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT()).header("Authorization", playerHistory.getAuthorization()).method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        try {
            MatchHistoryResponse matchHistoryResponse = mapper.readValue(response.body(), MatchHistoryResponse.class);

            for (int i = 0; i < matchHistoryResponse.getHistory().size(); i++) {
                matchHistoryResponse.getHistory().get(i).setMatchDetailsResponse(service.getMatchDetails(matchHistoryResponse.getHistory().get(i).getMatchID()));
            }

            return matchHistoryResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
