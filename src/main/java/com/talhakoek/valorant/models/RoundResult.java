package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RoundResult{
    @JsonProperty("roundNum")
    public int getRoundNum() { 
		 return this.roundNum; } 
    public void setRoundNum(int roundNum) { 
		 this.roundNum = roundNum; } 
    int roundNum;
    @JsonProperty("roundResult") 
    public String getRoundResult() { 
		 return this.roundResult; } 
    public void setRoundResult(String roundResult) { 
		 this.roundResult = roundResult; } 
    String roundResult;
    @JsonProperty("roundCeremony") 
    public String getRoundCeremony() { 
		 return this.roundCeremony; } 
    public void setRoundCeremony(String roundCeremony) { 
		 this.roundCeremony = roundCeremony; } 
    String roundCeremony;
    @JsonProperty("winningTeam") 
    public String getWinningTeam() { 
		 return this.winningTeam; } 
    public void setWinningTeam(String winningTeam) { 
		 this.winningTeam = winningTeam; } 
    String winningTeam;
    @JsonProperty("plantRoundTime") 
    public int getPlantRoundTime() { 
		 return this.plantRoundTime; } 
    public void setPlantRoundTime(int plantRoundTime) { 
		 this.plantRoundTime = plantRoundTime; } 
    int plantRoundTime;
    @JsonProperty("plantPlayerLocations") 
    public ArrayList<PlantPlayerLocation> getPlantPlayerLocations() {
		 return this.plantPlayerLocations; } 
    public void setPlantPlayerLocations(ArrayList<PlantPlayerLocation> plantPlayerLocations) { 
		 this.plantPlayerLocations = plantPlayerLocations; } 
    ArrayList<PlantPlayerLocation> plantPlayerLocations;
    @JsonProperty("plantLocation") 
    public PlantLocation getPlantLocation() { 
		 return this.plantLocation; } 
    public void setPlantLocation(PlantLocation plantLocation) { 
		 this.plantLocation = plantLocation; } 
    PlantLocation plantLocation;
    @JsonProperty("plantSite") 
    public String getPlantSite() { 
		 return this.plantSite; } 
    public void setPlantSite(String plantSite) { 
		 this.plantSite = plantSite; } 
    String plantSite;
    @JsonProperty("defuseRoundTime") 
    public int getDefuseRoundTime() { 
		 return this.defuseRoundTime; } 
    public void setDefuseRoundTime(int defuseRoundTime) { 
		 this.defuseRoundTime = defuseRoundTime; } 
    int defuseRoundTime;
    @JsonProperty("defusePlayerLocations") 
    public ArrayList<DefusePlayerLocation> getDefusePlayerLocations() { 
		 return this.defusePlayerLocations; } 
    public void setDefusePlayerLocations(ArrayList<DefusePlayerLocation> defusePlayerLocations) { 
		 this.defusePlayerLocations = defusePlayerLocations; } 
    ArrayList<DefusePlayerLocation> defusePlayerLocations;
    @JsonProperty("defuseLocation") 
    public DefuseLocation getDefuseLocation() { 
		 return this.defuseLocation; } 
    public void setDefuseLocation(DefuseLocation defuseLocation) { 
		 this.defuseLocation = defuseLocation; } 
    DefuseLocation defuseLocation;
    @JsonProperty("playerStats") 
    public ArrayList<PlayerStat> getPlayerStats() { 
		 return this.playerStats; } 
    public void setPlayerStats(ArrayList<PlayerStat> playerStats) { 
		 this.playerStats = playerStats; } 
    ArrayList<PlayerStat> playerStats;
    @JsonProperty("roundResultCode") 
    public String getRoundResultCode() { 
		 return this.roundResultCode; } 
    public void setRoundResultCode(String roundResultCode) { 
		 this.roundResultCode = roundResultCode; } 
    String roundResultCode;
    @JsonProperty("playerEconomies") 
    public ArrayList<PlayerEconomy> getPlayerEconomies() { 
		 return this.playerEconomies; } 
    public void setPlayerEconomies(ArrayList<PlayerEconomy> playerEconomies) { 
		 this.playerEconomies = playerEconomies; } 
    ArrayList<PlayerEconomy> playerEconomies;
    @JsonProperty("playerScores") 
    public ArrayList<PlayerScore> getPlayerScores() { 
		 return this.playerScores; } 
    public void setPlayerScores(ArrayList<PlayerScore> playerScores) { 
		 this.playerScores = playerScores; } 
    ArrayList<PlayerScore> playerScores;
    @JsonProperty("bombPlanter") 
    public String getBombPlanter() { 
		 return this.bombPlanter; } 
    public void setBombPlanter(String bombPlanter) { 
		 this.bombPlanter = bombPlanter; } 
    String bombPlanter;
    @JsonProperty("bombDefuser") 
    public String getBombDefuser() { 
		 return this.bombDefuser; } 
    public void setBombDefuser(String bombDefuser) { 
		 this.bombDefuser = bombDefuser; } 
    String bombDefuser;
}
