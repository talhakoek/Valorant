package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats{
    @JsonProperty("score")
    public int getScore() { 
		 return this.score; } 
    public void setScore(int score) { 
		 this.score = score; } 
    int score;
    @JsonProperty("roundsPlayed") 
    public int getRoundsPlayed() { 
		 return this.roundsPlayed; } 
    public void setRoundsPlayed(int roundsPlayed) { 
		 this.roundsPlayed = roundsPlayed; } 
    int roundsPlayed;
    @JsonProperty("kills") 
    public int getKills() { 
		 return this.kills; } 
    public void setKills(int kills) { 
		 this.kills = kills; } 
    int kills;
    @JsonProperty("deaths") 
    public int getDeaths() { 
		 return this.deaths; } 
    public void setDeaths(int deaths) { 
		 this.deaths = deaths; } 
    int deaths;
    @JsonProperty("assists") 
    public int getAssists() { 
		 return this.assists; } 
    public void setAssists(int assists) { 
		 this.assists = assists; } 
    int assists;
    @JsonProperty("playtimeMillis") 
    public int getPlaytimeMillis() { 
		 return this.playtimeMillis; } 
    public void setPlaytimeMillis(int playtimeMillis) { 
		 this.playtimeMillis = playtimeMillis; } 
    int playtimeMillis;
    @JsonProperty("abilityCasts") 
    public AbilityCasts getAbilityCasts() { 
		 return this.abilityCasts; } 
    public void setAbilityCasts(AbilityCasts abilityCasts) { 
		 this.abilityCasts = abilityCasts; } 
    AbilityCasts abilityCasts;
}
