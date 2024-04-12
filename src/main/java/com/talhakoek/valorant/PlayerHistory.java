package com.talhakoek.valorant;




import com.talhakoek.valorant.api.ApiException;
import com.talhakoek.valorant.api.DefaultApi;
import com.talhakoek.valorant.model.V1Account;
import com.talhakoek.valorant.model.V1AccountData;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Named
@ApplicationScoped
public class PlayerHistory {

    @Inject
    @RestClient

    DefaultApi defaultApi;
    V1Account v1Account = new V1Account();

    public String nameTagtoPUUID() throws ApiException {
        v1Account=defaultApi.valorantV1AccountNameTagGet(name,tag,force);
        puuid = v1Account.getData().getPuuid();
        return "index?faces-redirect=true";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }
    private String name;
    private String tag;
    private String puuid;
    private boolean force=false;




}
