package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MatchDetailsResponse {
    @JsonProperty("matchInfo")
    public MatchInfo getMatchInfo() {
        return this.matchInfo;
    }

    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }

    MatchInfo matchInfo;

    @JsonProperty("players")
    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    ArrayList<Player> players;

    @JsonProperty("bots")
    public ArrayList<Object> getBots() {
        return this.bots;
    }

    public void setBots(ArrayList<Object> bots) {
        this.bots = bots;
    }

    ArrayList<Object> bots;

    @JsonProperty("coaches")
    public ArrayList<Object> getCoaches() {
        return this.coaches;
    }

    public void setCoaches(ArrayList<Object> coaches) {
        this.coaches = coaches;
    }

    ArrayList<Object> coaches;

    @JsonProperty("teams")
    public ArrayList<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    ArrayList<Team> teams;

    @JsonProperty("roundResults")
    public ArrayList<RoundResult> getRoundResults() {
        return this.roundResults;
    }

    public void setRoundResults(ArrayList<RoundResult> roundResults) {
        this.roundResults = roundResults;
    }

    ArrayList<RoundResult> roundResults;

    @JsonProperty("kills")
    public ArrayList<Kill> getKills() {
        return this.kills;
    }

    public void setKills(ArrayList<Kill> kills) {
        this.kills = kills;
    }

    ArrayList<Kill> kills;
    MatchResults results;

    public MatchResults getResults() {
        return results;
    }

    public void setResults(MatchResults results) {
        this.results = results;
    }
}
