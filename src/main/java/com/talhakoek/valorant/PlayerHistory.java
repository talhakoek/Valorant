package com.talhakoek.valorant;

import com.talhakoek.valorant.api.ApiException;
import com.talhakoek.valorant.api.DefaultApi;
import com.talhakoek.valorant.model.*;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.io.*;

import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Properties;

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


    String X_Riot_Entitlements_JWT="";
    String Authorization="";
    V1Account v1Account = new V1Account();

    V1LifetimeMatches v1LifetimeMatches = new V1LifetimeMatches();
    V1AccountData v1AccountData = new V1AccountData();


    private String name;
    private String puuid;
    private boolean force = false;


    @PostConstruct
    public void init() {
        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("config.properties");
            prop.load(input);
            X_Riot_Entitlements_JWT = prop.getProperty("X-Riot-Entitlements-JWT");
            Authorization = prop.getProperty("Authorization");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

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
