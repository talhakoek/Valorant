package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team{
    @JsonProperty("teamId")
    public String getTeamId() { 
		 return this.teamId; } 
    public void setTeamId(String teamId) { 
		 this.teamId = teamId; } 
    String teamId;
    @JsonProperty("won") 
    public boolean getWon() { 
		 return this.won; } 
    public void setWon(boolean won) { 
		 this.won = won; } 
    boolean won;
    @JsonProperty("roundsPlayed") 
    public int getRoundsPlayed() { 
		 return this.roundsPlayed; } 
    public void setRoundsPlayed(int roundsPlayed) { 
		 this.roundsPlayed = roundsPlayed; } 
    int roundsPlayed;
    @JsonProperty("roundsWon") 
    public int getRoundsWon() { 
		 return this.roundsWon; } 
    public void setRoundsWon(int roundsWon) { 
		 this.roundsWon = roundsWon; } 
    int roundsWon;
    @JsonProperty("numPoints") 
    public int getNumPoints() { 
		 return this.numPoints; } 
    public void setNumPoints(int numPoints) { 
		 this.numPoints = numPoints; } 
    int numPoints;
    @JsonProperty("rosterInfo")
    public RosterInfo getRosterInfo() {
        return this.rosterInfo; }
    public void setRosterInfo(RosterInfo rosterInfo) {
        this.rosterInfo = rosterInfo; }
    RosterInfo rosterInfo;
}
