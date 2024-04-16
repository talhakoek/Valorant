package com.talhakoek.valorant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talhakoek.valorant.api.ApiException;
import com.talhakoek.valorant.api.DefaultApi;
import com.talhakoek.valorant.model.*;
import com.talhakoek.valorant.models.MapsResponse;
import com.talhakoek.valorant.models.MatchHistoryResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Named
@ApplicationScoped
public class PlayerHistory implements Serializable {

    @Inject
    @RestClient
    DefaultApi defaultApi;
    /*
    String X_Riot_Entitlements_JWT="";
    String Authorization="";
    */ String X_Riot_Entitlements_JWT = "eyJraWQiOiJrMSIsImFsZyI6IlJTMjU2In0.eyJlbnRpdGxlbWVudHMiOltdLCJhdF9oYXNoIjoicmNuRGV0STBqclB2NzdyUEZTbklvQSIsInN1YiI6IjMxY2RhODMxLTY4YjUtNTkyMy04YzBmLWU2YTkzNmViNDllZSIsImlzcyI6Imh0dHBzOlwvXC9lbnRpdGxlbWVudHMuYXV0aC5yaW90Z2FtZXMuY29tIiwiaWF0IjoxNzEzMjQ5ODI4LCJqdGkiOiJKSFBCTjZjOUhRdyJ9.YyBZMzjgA24O4Ny1HY7Ntit3TsFK0rETzdvWpVzZ_1ggScj1o3IOoVeSb2ymQvGU5P6b9pj4dW9YCGo3w7ZI3r3MoYhsKrTFcOBnbusMdE6-Hi-XuEXI9vvP4ZwJX-qROpp2-rvQbwRxfkdoQoiq8YBErYtB8mBCSNvzjj8reEk2dJwJwhTtu5yEfb6zcUMY-R_no0rQTBWFxAVHXxYs2pcRyh56g_iz9YVq6C0CxFzO_GKq_AyW1L7tkhr7_ogZ5TZtAmWvv8G5KVwjO0jkzuXvCwXrwQSBmmD9iY-21krIB3_io4at_NX9igNtP27buoTkJXtk4-NGk6nhro0IZw";
    String Authorization = "Bearer eyJraWQiOiJzMSIsImFsZyI6IlJTMjU2In0.eyJwcCI6eyJjIjoiZXUifSwic3ViIjoiMzFjZGE4MzEtNjhiNS01OTIzLThjMGYtZTZhOTM2ZWI0OWVlIiwic2NwIjpbImFjY291bnQiLCJvcGVuaWQiXSwiY2xtIjpbImVtYWlsX3ZlcmlmaWVkIiwib3BlbmlkIiwicHciLCJyZ25fRVVXMSIsInBob25lX251bWJlcl92ZXJpZmllZCIsImxvY2FsZSIsImFjY291bnRfdmVyaWZpZWQiLCJmZWRlcmF0ZWRfaWRlbnRpdHlfZGV0YWlscyIsImZlZGVyYXRlZF9pZGVudGl0eV9wcm92aWRlcnMiLCJhY2N0X2dudCIsImFjY3QiLCJhZ2UiLCJhZmZpbml0eSJdLCJkYXQiOnsicCI6bnVsbCwiciI6IkVVVzEiLCJjIjoidXcxIiwidSI6Mjk0NDc1NDgzMDA4MzM2MCwibGlkIjoiQXZYZmVRZVVNandJYzJuaTU2RWpHdyJ9LCJpc3MiOiJodHRwczovL2F1dGgucmlvdGdhbWVzLmNvbSIsInBsdCI6eyJkZXYiOiJ1bmtub3duIiwiaWQiOiJ3aW5kb3dzIn0sImV4cCI6MTcxMzI1MzQyNywiaWF0IjoxNzEzMjQ5ODI3LCJqdGkiOiJKSFBCTjZjOUhRdyIsImNpZCI6InBsYXktdmFsb3JhbnQtd2ViLXByb2QifQ.NkwERGJ_P2q7YAsqmdi505oOODfFVj38Wr0c9JWEh-fanwG8MxxQExU_FHW4qM9Qekt2CLwp35rfoJPOu5hHMp4anbUgkGNu5pROS5M3IJZq9BQdYnMWewV9LjwbldUm8xpcPLQVUKTf3QEo4Xj60SjQGsZUBCRVllO-ABtI3EA";

    V1Account v1Account = new V1Account();

    V1LifetimeMatches v1LifetimeMatches = new V1LifetimeMatches();
    V1AccountData v1AccountData = new V1AccountData();


    private String name;
    private String puuid;
    private boolean force = false;


    public String nameTagtoPUUID() throws ApiException {
        if (name.contains("#")) {
            v1Account = defaultApi.valorantV1AccountNameTagGet(name.substring(0, name.indexOf('#')), name.substring(name.indexOf('#')), force);
            v1AccountData = v1Account.getData();

            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("puuid", v1AccountData.getPuuid());

            return "matches.xhtml?faces-redirect=true";
        }

        return "";
    }

    public V1LifetimeMatches getV1LifetimeMatches() {
        return v1LifetimeMatches;
    }

    public void setV1LifetimeMatches(V1LifetimeMatches v1LifetimeMatches) {
        this.v1LifetimeMatches = v1LifetimeMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public V1AccountData getV1AccountData() {
        return v1AccountData;
    }

    public void setV1AccountData(V1AccountData v1AccountData) {
        this.v1AccountData = v1AccountData;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public V1Account getV1Account() {
        return v1Account;
    }

    public void setV1Account(V1Account v1Account) {
        this.v1Account = v1Account;
    }

    public String getX_Riot_Entitlements_JWT() {
        return X_Riot_Entitlements_JWT;
    }

    public void setX_Riot_Entitlements_JWT(String x_Riot_Entitlements_JWT) {
        X_Riot_Entitlements_JWT = x_Riot_Entitlements_JWT;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String authorization) {
        Authorization = authorization;
    }
}
