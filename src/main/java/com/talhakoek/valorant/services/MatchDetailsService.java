package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.models.MatchDetailsResponse;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Named
@RequestScoped
public class MatchDetailsService {
    public MatchDetailsResponse getMatchDetails(String matchID) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pd.eu.a.pvp.net/match-details/v1/matches/"+matchID))
                .header("X-Riot-Entitlements-JWT", "REMOVED")
                .header("Authorization", "REMOVED")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        MatchDetailsResponse matchDetailsResponse = objectMapper.readValue(response.body(), MatchDetailsResponse.class);
        return matchDetailsResponse;
    }
}

