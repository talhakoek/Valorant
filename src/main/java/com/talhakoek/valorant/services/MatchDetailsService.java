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
                .header("X-Riot-Entitlements-JWT", "eyJraWQiOiJrMSIsImFsZyI6IlJTMjU2In0.eyJlbnRpdGxlbWVudHMiOltdLCJhdF9oYXNoIjoibk9hMU5lVXdJSGVXWE9vQktMbVlYZyIsInN1YiI6IjMxY2RhODMxLTY4YjUtNTkyMy04YzBmLWU2YTkzNmViNDllZSIsImlzcyI6Imh0dHBzOlwvXC9lbnRpdGxlbWVudHMuYXV0aC5yaW90Z2FtZXMuY29tIiwiaWF0IjoxNzEzMTE2MjI2LCJqdGkiOiJZS3pJSTR1eDZ3byJ9.g6EMnljOyhJx0oL3of3VJzPsC5_0fAbrbDYvj9TekrzifuSUta9Pv1WLwGei4rAUddoj_-dHao3zRT8aXfZvhCRJFT1VPC7a4viRSWDIEr7pRqzhNXNlbFKRpVR8-ip3SA9HvcnUbXFilzKARauWUO4Lztx1fkKP8yS_f8jiNq_hCBWQavIsoChGFY_a3IXJepTjCj_9IKK93e4lTYvGuldQm6UodmUTmMeKhVSgBWH1qCTM2Ot5-lLPA7Fmt6sp48bXedPx1yCPcREK_hpa3jOhljxg6yAIkYnRmqo7DrV7xTalXRUzTYnPSeBm04D6LoUG308O41XUi8bzmD1DfQ")
                .header("Authorization", "Bearer eyJraWQiOiJzMSIsImFsZyI6IlJTMjU2In0.eyJwcCI6eyJjIjoiZXUifSwic3ViIjoiMzFjZGE4MzEtNjhiNS01OTIzLThjMGYtZTZhOTM2ZWI0OWVlIiwic2NwIjpbImFjY291bnQiLCJvcGVuaWQiXSwiY2xtIjpbImVtYWlsX3ZlcmlmaWVkIiwib3BlbmlkIiwicHciLCJyZ25fRVVXMSIsInBob25lX251bWJlcl92ZXJpZmllZCIsImxvY2FsZSIsImFjY291bnRfdmVyaWZpZWQiLCJmZWRlcmF0ZWRfaWRlbnRpdHlfZGV0YWlscyIsImZlZGVyYXRlZF9pZGVudGl0eV9wcm92aWRlcnMiLCJhY2N0X2dudCIsImFjY3QiLCJhZ2UiLCJhZmZpbml0eSJdLCJkYXQiOnsicCI6bnVsbCwiciI6IkVVVzEiLCJjIjoiZWMxIiwidSI6Mjk0NDc1NDgzMDA4MzM2MCwibGlkIjoiNEU4UmVzeWRVUFA4WGVXNk8yZlJidyJ9LCJpc3MiOiJodHRwczovL2F1dGgucmlvdGdhbWVzLmNvbSIsInBsdCI6eyJkZXYiOiJ1bmtub3duIiwiaWQiOiJ3aW5kb3dzIn0sImV4cCI6MTcxMzExOTgyNiwiaWF0IjoxNzEzMTE2MjI2LCJqdGkiOiJZS3pJSTR1eDZ3byIsImNpZCI6InBsYXktdmFsb3JhbnQtd2ViLXByb2QifQ.RIidJ6MUWZmXDYSB4ksjO21hk-MEgkafztlhf_WLkBzsVs4THq_ryKLgA4DWFU0MCkLPFuDCK5AmbsQe-YxKujSGQDP1Q6sTPfTYFWO1_eZf7cMMWpoAQZ_XYHLuSjtgYzBx5cU_FvDogvcexB6ZExu-KsiuZjaDdENXkuGygB0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        MatchDetailsResponse matchDetailsResponse = objectMapper.readValue(response.body(), MatchDetailsResponse.class);
        return matchDetailsResponse;
    }
}

