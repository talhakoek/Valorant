package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityCasts{
    @JsonProperty("grenadeCasts")
    public int getGrenadeCasts() { 
		 return this.grenadeCasts; } 
    public void setGrenadeCasts(int grenadeCasts) { 
		 this.grenadeCasts = grenadeCasts; } 
    int grenadeCasts;
    @JsonProperty("ability1Casts") 
    public int getAbility1Casts() { 
		 return this.ability1Casts; } 
    public void setAbility1Casts(int ability1Casts) { 
		 this.ability1Casts = ability1Casts; } 
    int ability1Casts;
    @JsonProperty("ability2Casts") 
    public int getAbility2Casts() { 
		 return this.ability2Casts; } 
    public void setAbility2Casts(int ability2Casts) { 
		 this.ability2Casts = ability2Casts; } 
    int ability2Casts;
    @JsonProperty("ultimateCasts") 
    public int getUltimateCasts() { 
		 return this.ultimateCasts; } 
    public void setUltimateCasts(int ultimateCasts) { 
		 this.ultimateCasts = ultimateCasts; } 
    int ultimateCasts;
}
