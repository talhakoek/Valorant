package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Kill{
    @JsonProperty("gameTime")
    public int getGameTime() { 
		 return this.gameTime; } 
    public void setGameTime(int gameTime) { 
		 this.gameTime = gameTime; } 
    int gameTime;
    @JsonProperty("roundTime") 
    public int getRoundTime() { 
		 return this.roundTime; } 
    public void setRoundTime(int roundTime) { 
		 this.roundTime = roundTime; } 
    int roundTime;
    @JsonProperty("killer") 
    public String getKiller() { 
		 return this.killer; } 
    public void setKiller(String killer) { 
		 this.killer = killer; } 
    String killer;
    @JsonProperty("victim") 
    public String getVictim() { 
		 return this.victim; } 
    public void setVictim(String victim) { 
		 this.victim = victim; } 
    String victim;
    @JsonProperty("victimLocation") 
    public VictimLocation getVictimLocation() { 
		 return this.victimLocation; } 
    public void setVictimLocation(VictimLocation victimLocation) { 
		 this.victimLocation = victimLocation; } 
    VictimLocation victimLocation;
    @JsonProperty("assistants") 
    public ArrayList<String> getAssistants() {
		 return this.assistants; } 
    public void setAssistants(ArrayList<String> assistants) { 
		 this.assistants = assistants; } 
    ArrayList<String> assistants;
    @JsonProperty("playerLocations") 
    public ArrayList<PlayerLocation> getPlayerLocations() { 
		 return this.playerLocations; } 
    public void setPlayerLocations(ArrayList<PlayerLocation> playerLocations) { 
		 this.playerLocations = playerLocations; } 
    ArrayList<PlayerLocation> playerLocations;
    @JsonProperty("finishingDamage") 
    public FinishingDamage getFinishingDamage() { 
		 return this.finishingDamage; } 
    public void setFinishingDamage(FinishingDamage finishingDamage) { 
		 this.finishingDamage = finishingDamage; } 
    FinishingDamage finishingDamage;
    @JsonProperty("round") 
    public int getRound() { 
		 return this.round; } 
    public void setRound(int round) { 
		 this.round = round; } 
    int round;
}
