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
    */

    String X_Riot_Entitlements_JWT="eyJraWQiOiJrMSIsImFsZyI6IlJTMjU2In0.eyJlbnRpdGxlbWVudHMiOltdLCJhdF9oYXNoIjoid0xWMk1iUmZLdEF5TEpQcGVhRUZRQSIsInN1YiI6IjMxY2RhODMxLTY4YjUtNTkyMy04YzBmLWU2YTkzNmViNDllZSIsImlzcyI6Imh0dHBzOlwvXC9lbnRpdGxlbWVudHMuYXV0aC5yaW90Z2FtZXMuY29tIiwiaWF0IjoxNzEzMzgxNTQ0LCJqdGkiOiJJN3AydXNsQ0JuZyJ9.wv_yLPg2iAWOUUYKQy_G2E1mkelzqRUq6EQBctmLSwAk6OV6Q9u5AFjKUwmi__IhR3N5BRulshfzZT7ZUU0C53_Vfcfeo0vrCH6CeP07EF2GllACTV-iWsxIe2PA7bdEooyf5hhsfLCOUSu9AGhCtCCQky3JVKcnMAqh5dPPNGxJaBJ1TF64XCcJFCXq9Jk9vb9022nzzIJxbS44UX6z10oL_nRojyxHFlk7BCf5avM15f4rjqf-xS95VVc5qvuY_zzeNq-svLssJwH6q08l1FFIdjwtNYNdZQj6xB5by7S449FteVcirpChZE6usR-i2gVaIO-fwUqionRg4bZMJw";
    String Authorization="Bearer eyJraWQiOiJzMSIsImFsZyI6IlJTMjU2In0.eyJwcCI6eyJjIjoiZXUifSwic3ViIjoiMzFjZGE4MzEtNjhiNS01OTIzLThjMGYtZTZhOTM2ZWI0OWVlIiwic2NwIjpbImFjY291bnQiLCJvcGVuaWQiXSwiY2xtIjpbImVtYWlsX3ZlcmlmaWVkIiwib3BlbmlkIiwicHciLCJyZ25fRVVXMSIsInBob25lX251bWJlcl92ZXJpZmllZCIsImxvY2FsZSIsImFjY291bnRfdmVyaWZpZWQiLCJmZWRlcmF0ZWRfaWRlbnRpdHlfZGV0YWlscyIsImZlZGVyYXRlZF9pZGVudGl0eV9wcm92aWRlcnMiLCJhY2N0X2dudCIsImFjY3QiLCJhZ2UiLCJhZmZpbml0eSJdLCJkYXQiOnsicCI6bnVsbCwiciI6IkVVVzEiLCJjIjoiZWMxIiwidSI6Mjk0NDc1NDgzMDA4MzM2MCwibGlkIjoiNEU4UmVzeWRVUFA4WGVXNk8yZlJidyJ9LCJpc3MiOiJodHRwczovL2F1dGgucmlvdGdhbWVzLmNvbSIsInBsdCI6eyJkZXYiOiJ1bmtub3duIiwiaWQiOiJ3aW5kb3dzIn0sImV4cCI6MTcxMzM4NTE0NCwiaWF0IjoxNzEzMzgxNTQ0LCJqdGkiOiJJN3AydXNsQ0JuZyIsImNpZCI6InBsYXktdmFsb3JhbnQtd2ViLXByb2QifQ.cW1HSJp8h9tUNV9s7iX0CPs3h4dsE0aCsk2KoqIDFv-S9iWojNS0EQqv20wRGkQn-SgeoaboGsXyc5qirnJc98uVQV6GlKoLsJdt7S1XlNY6vH2OxKPbhFRE11VOuU2H4qJgGQuMvxZnkIZT0LSk4z2ayCEhTgwJKOso_M-4tH8";
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
            puuid=v1AccountData.getPuuid();

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
