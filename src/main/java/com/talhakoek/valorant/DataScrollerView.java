package com.talhakoek.valorant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.api.ApiException;
import com.talhakoek.valorant.models.MapsResponse;
import com.talhakoek.valorant.models.MatchHistoryResponse;
import com.talhakoek.valorant.services.MatchHistoryService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Named
@RequestScoped
public class DataScrollerView implements Serializable {

    String PUUID="";
    int start=0;
    int end=20;
    String X_Riot_Entitlements_JWT ="eyJraWQiOiJrMSIsImFsZyI6IlJTMjU2In0.eyJlbnRpdGxlbWVudHMiOltdLCJhdF9oYXNoIjoiOTBwWldiWEVyMnhneDFNX3VGZk1NUSIsInN1YiI6IjMxY2RhODMxLTY4YjUtNTkyMy04YzBmLWU2YTkzNmViNDllZSIsImlzcyI6Imh0dHBzOlwvXC9lbnRpdGxlbWVudHMuYXV0aC5yaW90Z2FtZXMuY29tIiwiaWF0IjoxNzEzMDk5NjAzLCJqdGkiOiJFZUp3cDNNYmlaNCJ9.Z47ZXEtYJ-4cCiub78cZQFxjPj0P4XXq6rw8gN7ofNoWMLelDpqf_sIOkdOv1sS1hCFHcWdmrRlLl-zJcxkUq1ugcbzMNi3V0ldZDYYbl9HbN5qt9DPrmI5KKEV6Aew1EQEhw6-9Du8mUcMrEJVW42e0BkNHeKI484cNfGTbGzXlxzb2LV7ypfaePmqV1h5sf-R3cj01xnTQrwJSep5YNkVghkQHsfWX7Yssbs3_2RwttNwAbjyK25oUhrI6Wz85qIfS7BCLwqE-JnV8wew3ErMBXBOkfU4uTaP9qkdQQQ0LP0vvIyKbNTmH75-HzArTuEdfGNscR9DRKxECXG_tHw";
    String Authorization="eyJraWQiOiJzMSIsImFsZyI6IlJTMjU2In0.eyJwcCI6eyJjIjoiZXUifSwic3ViIjoiMzFjZGE4MzEtNjhiNS01OTIzLThjMGYtZTZhOTM2ZWI0OWVlIiwic2NwIjpbImFjY291bnQiLCJvcGVuaWQiXSwiY2xtIjpbImVtYWlsX3ZlcmlmaWVkIiwib3BlbmlkIiwicHciLCJyZ25fRVVXMSIsInBob25lX251bWJlcl92ZXJpZmllZCIsImxvY2FsZSIsImFjY291bnRfdmVyaWZpZWQiLCJmZWRlcmF0ZWRfaWRlbnRpdHlfZGV0YWlscyIsImZlZGVyYXRlZF9pZGVudGl0eV9wcm92aWRlcnMiLCJhY2N0X2dudCIsImFjY3QiLCJhZ2UiLCJhZmZpbml0eSJdLCJkYXQiOnsicCI6bnVsbCwiciI6IkVVVzEiLCJjIjoiZWMxIiwidSI6Mjk0NDc1NDgzMDA4MzM2MCwibGlkIjoiNEU4UmVzeWRVUFA4WGVXNk8yZlJidyJ9LCJpc3MiOiJodHRwczovL2F1dGgucmlvdGdhbWVzLmNvbSIsInBsdCI6eyJkZXYiOiJ1bmtub3duIiwiaWQiOiJ3aW5kb3dzIn0sImV4cCI6MTcxMzEwMzIwMiwiaWF0IjoxNzEzMDk5NjAyLCJqdGkiOiJFZUp3cDNNYmlaNCIsImNpZCI6InBsYXktdmFsb3JhbnQtd2ViLXByb2QifQ.PH-SbDiG5-EzeWRXwIEpJPM19bqG3ZuzEXQeF5jMKhADXPddSFADGqoH8PqXE2NtOG-esbvtYM1yjZSBtgV2M3KgijE81oYYm1HTyMkjHKlbqCI3jIGSImNcm1AUvIygnyx7DyHsmOOV29ricTzIEiycTh-1bOut4-O8ctHWmAY";
    public MatchHistoryResponse getMatches() {
        return matches;
    }

    public void setMatches(MatchHistoryResponse matches) {
        this.matches = matches;
    }
    public String getPUUIDFromFlash() {
        return (String) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("puuid");
    }

    private MatchHistoryResponse matches;
    MapsResponse mapsResponse;

    @Inject
    private MatchHistoryService service;
    @Inject
    PlayerHistory playerHistory;
    @PostConstruct
    public void init() {

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://valorant-api.com/v1/maps"))
                    .header("User-Agent", "insomnium/0.2.3-a")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            mapsResponse  = mapper.readValue(response.body(), MapsResponse.class);

            PUUID = getPUUIDFromFlash();
            if (PUUID != null && !PUUID.isEmpty()) {
                matches = service.getMatchHistory(PUUID);


            } else {
                // Handle missing PUUID, maybe redirect or show error message "eu", PUUID, Authorization, X_Riot_Entitlements_JWT, start, end
                System.out.println("PUUID is missing or invalid.");
            }
        } catch (Exception e) {
            // Log or handle initialization error
            e.printStackTrace();
        }
    }


    public MatchHistoryResponse getProducts() {
        return matches;
    }

    public void setService(MatchHistoryService service) {
        this.service = service;
    }

    public String getmorematches() throws IOException, InterruptedException {
        start=end;
        end=end+20;
        matches = service.getMatchHistory(PUUID); // "eu",PUUID,Authorization,X_Riot_Entitlements_JWT,start,end
        return "matches.xhtml?faces-redirect=true";
    }

    public String getmapUUID(String mapid) throws ApiException, IOException, InterruptedException {
        System.out.println(playerHistory.getPuuid());

        for (int i = 0; i < mapsResponse.getData().size(); i++) {
            if (mapsResponse.getData().get(i).getMapUrl().compareTo(mapid) == 0){
                return mapsResponse.getData().get(i).getUuid();
            }
        }
        return null;
    }

    public String returnToSearch() {
        return "index.xhtml?faces-redirect=true";
    }
}