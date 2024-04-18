package com.talhakoek.valorant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.api.ApiException;
import com.talhakoek.valorant.models.CompetitiveUpdates;
import com.talhakoek.valorant.models.CurrentRank;
import com.talhakoek.valorant.models.MapsResponse;
import com.talhakoek.valorant.models.MatchHistoryResponse;
import com.talhakoek.valorant.services.MatchDetailsService;
import com.talhakoek.valorant.services.MatchHistoryService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Named
@ViewScoped
public class DataScrollerView implements Serializable {

    String PUUID = "";
    int start = 0;
    int end = 20;

    public CompetitiveUpdates getMatches() {
        return competitiveUpdates;
    }

    public void setMatches(CompetitiveUpdates competitiveUpdates) {
        this.competitiveUpdates = competitiveUpdates;
    }

    public String getPUUIDFromFlash() {
        return (String) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("puuid");
    }

    private CompetitiveUpdates competitiveUpdates;
    MapsResponse mapsResponse;

    @Inject
    private MatchHistoryService service;
    @Inject
    PlayerHistory playerHistory;

    public CurrentRank getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(CurrentRank currentRank) {
        this.currentRank = currentRank;
    }

    CurrentRank currentRank;

    @PostConstruct
    public void init() {
        long start = System.currentTimeMillis();
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://valorant-api.com/v1/maps")).header("User-Agent", "insomnium/0.2.3-a").method("GET", HttpRequest.BodyPublishers.noBody()).build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            mapsResponse = mapper.readValue(response.body(), MapsResponse.class);

            PUUID = getPUUIDFromFlash();
            if (PUUID != null && !PUUID.isEmpty()) {
                currentRank = service.getCurrentRank(PUUID);
                competitiveUpdates = service.getMatchHistory(PUUID);
                System.out.println(competitiveUpdates.getMatches().get(0).getMatchDetailsResponse()==null);


            } else {
                // Handle missing PUUID, maybe redirect or show error message "eu", PUUID, Authorization, X_Riot_Entitlements_JWT, start, end
                //System.out.println("PUUID is missing or invalid.");
            }
        } catch (Exception e) {
            // Log or handle initialization error
            e.printStackTrace();
        }
    }


    public void setService(MatchHistoryService service) {
        this.service = service;
    }

    public String getmorematches() throws Exception {
        start = end;
        end = end + 20;
        competitiveUpdates = service.getMatchHistory(PUUID); // "eu",PUUID,Authorization,X_Riot_Entitlements_JWT,start,end
        return "matches.xhtml?faces-redirect=true";
    }

    public String getmapUUID(String mapid) throws ApiException, IOException, InterruptedException {

        for (int i = 0; i < mapsResponse.getData().size(); i++) {
            if (mapsResponse.getData().get(i).getMapUrl().compareTo(mapid) == 0) {
                return mapsResponse.getData().get(i).getUuid();
            }
        }
        return null;
    }

    public String returnToSearch() {
        return "index.xhtml?faces-redirect=true";
    }
}