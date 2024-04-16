package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
import com.talhakoek.valorant.models.MatchDetailsResponse;
import com.talhakoek.valorant.models.MatchResults;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Named
@RequestScoped
public class MatchDetailsService {
    @Inject
    PlayerHistory playerHistory;

    public MatchDetailsResponse getMatchDetails(String matchID) throws Exception {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://pd.eu.a.pvp.net/match-details/v1/matches/" + matchID)).header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT()).header("Authorization", playerHistory.getAuthorization()).method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        MatchDetailsResponse matchDetailsResponse = objectMapper.readValue(response.body(), MatchDetailsResponse.class);
        return matchDetailsResponse;
    }

    public MatchResults getResult(MatchDetailsResponse matchDetailsResponse) {
        MatchResults result = new MatchResults();


        return result;
    }

    public Boolean getWon(MatchDetailsResponse matchDetailsResponse){
        String Team="";
        for (int i = 0; i < matchDetailsResponse.getPlayers().size(); i++) {
            System.out.println(matchDetailsResponse.getPlayers().get(i).getSubject()+" "+playerHistory.getPuuid());
            if (matchDetailsResponse.getPlayers().get(i).getSubject().compareTo(playerHistory.getPuuid()) == 0){
                Team=matchDetailsResponse.getPlayers().get(i).getTeamId();
                break;
            }
        }
        switch (Team){
            case "red": return matchDetailsResponse.getTeams().get(0).getWon();
            case "blue": return matchDetailsResponse.getTeams().get(1).getWon();
        }
        return null;
    }
}