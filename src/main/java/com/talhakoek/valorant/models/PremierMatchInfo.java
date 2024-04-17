package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PremierMatchInfo{
    @JsonProperty("premierSeasonId")
    public String getPremierSeasonId() {
        return this.premierSeasonId; }
    public void setPremierSeasonId(String premierSeasonId) {
        this.premierSeasonId = premierSeasonId; }
    String premierSeasonId;
    @JsonProperty("premierEventId")
    public String getPremierEventId() {
        return this.premierEventId; }
    public void setPremierEventId(String premierEventId) {
        this.premierEventId = premierEventId; }
    String premierEventId;
}
