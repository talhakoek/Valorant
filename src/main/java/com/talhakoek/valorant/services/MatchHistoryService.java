package com.talhakoek.valorant.services;

import com.fasterxml.jackson.databind.ObjectMapper;
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
    private MatchDetailsService service;

    public MatchHistoryResponse getMatchHistory(String PUUID) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pd.eu.a.pvp.net/match-history/v1/history/"+PUUID))
                .header("X-Riot-Entitlements-JWT", "eyJraWQiOiJrMSIsImFsZyI6IlJTMjU2In0.eyJlbnRpdGxlbWVudHMiOltdLCJhdF9oYXNoIjoibk9hMU5lVXdJSGVXWE9vQktMbVlYZyIsInN1YiI6IjMxY2RhODMxLTY4YjUtNTkyMy04YzBmLWU2YTkzNmViNDllZSIsImlzcyI6Imh0dHBzOlwvXC9lbnRpdGxlbWVudHMuYXV0aC5yaW90Z2FtZXMuY29tIiwiaWF0IjoxNzEzMTE2MjI2LCJqdGkiOiJZS3pJSTR1eDZ3byJ9.g6EMnljOyhJx0oL3of3VJzPsC5_0fAbrbDYvj9TekrzifuSUta9Pv1WLwGei4rAUddoj_-dHao3zRT8aXfZvhCRJFT1VPC7a4viRSWDIEr7pRqzhNXNlbFKRpVR8-ip3SA9HvcnUbXFilzKARauWUO4Lztx1fkKP8yS_f8jiNq_hCBWQavIsoChGFY_a3IXJepTjCj_9IKK93e4lTYvGuldQm6UodmUTmMeKhVSgBWH1qCTM2Ot5-lLPA7Fmt6sp48bXedPx1yCPcREK_hpa3jOhljxg6yAIkYnRmqo7DrV7xTalXRUzTYnPSeBm04D6LoUG308O41XUi8bzmD1DfQ")
                .header("Authorization", "Bearer eyJraWQiOiJzMSIsImFsZyI6IlJTMjU2In0.eyJwcCI6eyJjIjoiZXUifSwic3ViIjoiMzFjZGE4MzEtNjhiNS01OTIzLThjMGYtZTZhOTM2ZWI0OWVlIiwic2NwIjpbImFjY291bnQiLCJvcGVuaWQiXSwiY2xtIjpbImVtYWlsX3ZlcmlmaWVkIiwib3BlbmlkIiwicHciLCJyZ25fRVVXMSIsInBob25lX251bWJlcl92ZXJpZmllZCIsImxvY2FsZSIsImFjY291bnRfdmVyaWZpZWQiLCJmZWRlcmF0ZWRfaWRlbnRpdHlfZGV0YWlscyIsImZlZGVyYXRlZF9pZGVudGl0eV9wcm92aWRlcnMiLCJhY2N0X2dudCIsImFjY3QiLCJhZ2UiLCJhZmZpbml0eSJdLCJkYXQiOnsicCI6bnVsbCwiciI6IkVVVzEiLCJjIjoiZWMxIiwidSI6Mjk0NDc1NDgzMDA4MzM2MCwibGlkIjoiNEU4UmVzeWRVUFA4WGVXNk8yZlJidyJ9LCJpc3MiOiJodHRwczovL2F1dGgucmlvdGdhbWVzLmNvbSIsInBsdCI6eyJkZXYiOiJ1bmtub3duIiwiaWQiOiJ3aW5kb3dzIn0sImV4cCI6MTcxMzExOTgyNiwiaWF0IjoxNzEzMTE2MjI2LCJqdGkiOiJZS3pJSTR1eDZ3byIsImNpZCI6InBsYXktdmFsb3JhbnQtd2ViLXByb2QifQ.RIidJ6MUWZmXDYSB4ksjO21hk-MEgkafztlhf_WLkBzsVs4THq_ryKLgA4DWFU0MCkLPFuDCK5AmbsQe-YxKujSGQDP1Q6sTPfTYFWO1_eZf7cMMWpoAQZ_XYHLuSjtgYzBx5cU_FvDogvcexB6ZExu-KsiuZjaDdENXkuGygB0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        try {
            MatchHistoryResponse matchHistoryResponse  = mapper.readValue(response.body(), MatchHistoryResponse.class);

            for (int i = 0; i < matchHistoryResponse.getHistory().size(); i++) {
                System.out.println(service.getMatchDetails(matchHistoryResponse.getHistory().get(i).getMatchID()).getMatchInfo().getMapId());
                matchHistoryResponse.getHistory().get(i).setMatchDetailsResponse(service.getMatchDetails(matchHistoryResponse.getHistory().get(i).getMatchID()));
            }

            return matchHistoryResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
