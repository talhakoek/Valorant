package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability{
    @JsonProperty("idleTimeMillis")
    public int getIdleTimeMillis() { 
		 return this.idleTimeMillis; } 
    public void setIdleTimeMillis(int idleTimeMillis) { 
		 this.idleTimeMillis = idleTimeMillis; } 
    int idleTimeMillis;
    @JsonProperty("objectiveCompleteTimeMillis") 
    public int getObjectiveCompleteTimeMillis() { 
		 return this.objectiveCompleteTimeMillis; } 
    public void setObjectiveCompleteTimeMillis(int objectiveCompleteTimeMillis) { 
		 this.objectiveCompleteTimeMillis = objectiveCompleteTimeMillis; } 
    int objectiveCompleteTimeMillis;
    @JsonProperty("grenadeEffects") 
    public Object getGrenadeEffects() { 
		 return this.grenadeEffects; } 
    public void setGrenadeEffects(Object grenadeEffects) { 
		 this.grenadeEffects = grenadeEffects; } 
    Object grenadeEffects;
    @JsonProperty("ability1Effects") 
    public Object getAbility1Effects() { 
		 return this.ability1Effects; } 
    public void setAbility1Effects(Object ability1Effects) { 
		 this.ability1Effects = ability1Effects; } 
    Object ability1Effects;
    @JsonProperty("ability2Effects") 
    public Object getAbility2Effects() { 
		 return this.ability2Effects; } 
    public void setAbility2Effects(Object ability2Effects) { 
		 this.ability2Effects = ability2Effects; } 
    Object ability2Effects;
    @JsonProperty("ultimateEffects") 
    public Object getUltimateEffects() { 
		 return this.ultimateEffects; } 
    public void setUltimateEffects(Object ultimateEffects) { 
		 this.ultimateEffects = ultimateEffects; } 
    Object ultimateEffects;
}
