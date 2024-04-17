package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.PlayerHistory;
import com.talhakoek.valorant.models.GameModes;
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

    List<GameModes> gameModes = Arrays.asList(
            new GameModes("/Game/GameModes/Bomb/BombGameMode.BombGameMode_C","96BD3920-4F36-D026-2B28-C683EB0BCAC5"),
            new GameModes("/Game/GameModes/Deathmatch/DeathmatchGameMode.DeathmatchGameMode_C","A8790EC5-4237-F2F0-E93B-08A8E89865B2"),
            new GameModes("/Game/GameModes/GunGame/GunGameTeamsGameMode.GunGameTeamsGameMode_C","A4ED6518-4741-6DCB-35BD-F884AECDC859"),
            new GameModes("/Game/GameModes/HURM/HURMGameMode.HURMGameMode_C","E086DB66-47FD-E791-CA81-06A645AC7661"),
            new GameModes("/Game/GameModes/NewPlayerExperience/NPEGameMode.NPEGameMode_C","D2B4E425-4CAB-8D95-EB26-BB9B444551DC"),
            new GameModes("/Game/GameModes/OneForAll/OneForAll_GameMode.OneForAll_GameMode_C","4744698A-4513-DC96-9C22-A9AA437E4A58"),
            new GameModes("/Game/GameModes/QuickBomb/QuickBombGameMode.QuickBombGameMode_C","E921D1E6-416B-C31F-1291-74930C330B7B"),
            new GameModes("/Game/GameModes/ShootingRange/ShootingRangeGameMode.ShootingRangeGameMode_C","E2DC3878-4FE5-D132-28F8-3D8C259EFCC6"),
            new GameModes("/Game/GameModes/SnowballFight/SnowballFightGameMode.SnowballFightGameMode_C","57038D6D-49B1-3A74-C5EF-3395D9F23A97"),
            new GameModes("/Game/GameModes/_Development/Swiftplay_EndOfRoundCredits/Swiftplay_EoRCredits_GameMode.Swiftplay_EoRCredits_GameMode_C","57038D6D-49B1-3A74-C5EF-3395D9F23A97"));

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
                    result.setScore(matchDetailsResponse.getTeams().get(0).getNumPoints() + "-" + matchDetailsResponse.getTeams().get(1).getNumPoints());
                } else {
                    result.setScore(matchDetailsResponse.getTeams().get(0).getNumPoints() + "-" + matchDetailsResponse.getTeams().get(1).getNumPoints());
                }
                break;
            case "Blue":
                result.setWon(matchDetailsResponse.getTeams().get(1).getWon());
                if (result.getWon()) {
                    result.setScore(matchDetailsResponse.getTeams().get(1).getNumPoints() + "-" + matchDetailsResponse.getTeams().get(0).getNumPoints());
                } else {
                    result.setScore(matchDetailsResponse.getTeams().get(1).getNumPoints() + "-" + matchDetailsResponse.getTeams().get(0).getNumPoints());
                }
                break;
        }


        return result;
    }

    public String getGamemodeUUID(String assetpath){
        for (int i = 0; i < gameModes.size(); i++) {
            if (gameModes.get(i).getAssetpath().compareTo(assetpath)==0){
                return gameModes.get(i).getUUID();
            }
        }
        return null;
    }

    public boolean getIsCompetitive(MatchDetailsResponse matchDetailsResponse){
        if (matchDetailsResponse.getMatchInfo().getQueueID().compareTo("competitive")==0)
            return true;
        return false;
    }
}