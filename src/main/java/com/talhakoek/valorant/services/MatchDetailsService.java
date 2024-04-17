package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
import com.talhakoek.valorant.models.MatchDetailsResponse;
import com.talhakoek.valorant.models.MatchResults;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Named
@ApplicationScoped
public class MatchDetailsService {

    @Inject
    PlayerHistory playerHistory;

    public MatchDetailsResponse getMatchDetails(String matchID) throws Exception {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://pd.eu.a.pvp.net/match-details/v1/matches/" + matchID))
                .header("X-Riot-Entitlements-JWT", playerHistory.getX_Riot_Entitlements_JWT())
                .header("X-Riot-ClientPlatform", "ew0KCSJwbGF0Zm9ybVR5cGUiOiAiUEMiLA0KCSJwbGF0Zm9ybU9TIjogIldpbmRvd3MiLA0KCSJwbGF0Zm9ybU9TVmVyc2lvbiI6ICIxMC4wLjE5MDQyLjEuMjU2LjY0Yml0IiwNCgkicGxhdGZvcm1DaGlwc2V0IjogIlVua25vd24iDQp9")
                .header("X-Riot-ClientVersion", "release-08.07-shipping-9-2444158")
                .header("Authorization", playerHistory.getAuthorization())
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        MatchDetailsResponse matchDetailsResponse = objectMapper.readValue(response.body(), MatchDetailsResponse.class);
        matchDetailsResponse.setResults(getResult(matchDetailsResponse));
        return matchDetailsResponse;
    }

    public MatchResults getResult(MatchDetailsResponse matchDetailsResponse) {
        MatchResults result = new MatchResults();

        String Team = "";
        for (int i = 0; i < matchDetailsResponse.getPlayers().size(); i++) {
            if (matchDetailsResponse.getPlayers().get(i).getSubject().compareTo(playerHistory.getPuuid()) == 0) {
                result.setAgentID(matchDetailsResponse.getPlayers().get(i).getCharacterId());

                Team = matchDetailsResponse.getPlayers().get(i).getTeamId();
                result.setPlayerScore(matchDetailsResponse.getPlayers().get(i).getStats().getScore());
                result.setKill(matchDetailsResponse.getPlayers().get(i).getStats().getKills());
                result.setDeath(matchDetailsResponse.getPlayers().get(i).getStats().getDeaths());
                result.setAssist(matchDetailsResponse.getPlayers().get(i).getStats().getAssists());
                result.setCompetitiveTier(matchDetailsResponse.getPlayers().get(i).getCompetitiveTier());
                break;
            }
        }
        switch (Team) {
            case "Red":
                result.setWon(matchDetailsResponse.getTeams().get(0).getWon());
                if (result.getWon()) {
                    result.setScore(matchDetailsResponse.getTeams().get(0).getRoundsWon() + "-" + matchDetailsResponse.getTeams().get(1).getRoundsWon());
                } else {
                    result.setScore(matchDetailsResponse.getTeams().get(0).getRoundsWon() + "-" + matchDetailsResponse.getTeams().get(1).getRoundsWon());
                }
                break;
            case "Blue":
                result.setWon(matchDetailsResponse.getTeams().get(1).getWon());
                if (result.getWon()) {
                    result.setScore(matchDetailsResponse.getTeams().get(1).getRoundsWon() + "-" + matchDetailsResponse.getTeams().get(0).getRoundsWon());
                } else {
                    result.setScore(matchDetailsResponse.getTeams().get(1).getRoundsWon() + "-" + matchDetailsResponse.getTeams().get(0).getRoundsWon());
                }
                break;
        }


        return result;
    }
}