package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewPlayerExperienceDetails{
    @JsonProperty("basicMovement")
    public BasicMovement getBasicMovement() { 
		 return this.basicMovement; } 
    public void setBasicMovement(BasicMovement basicMovement) { 
		 this.basicMovement = basicMovement; } 
    BasicMovement basicMovement;
    @JsonProperty("basicGunSkill") 
    public BasicGunSkill getBasicGunSkill() { 
		 return this.basicGunSkill; } 
    public void setBasicGunSkill(BasicGunSkill basicGunSkill) { 
		 this.basicGunSkill = basicGunSkill; } 
    BasicGunSkill basicGunSkill;
    @JsonProperty("adaptiveBots") 
    public AdaptiveBots getAdaptiveBots() { 
		 return this.adaptiveBots; } 
    public void setAdaptiveBots(AdaptiveBots adaptiveBots) { 
		 this.adaptiveBots = adaptiveBots; } 
    AdaptiveBots adaptiveBots;
    @JsonProperty("ability") 
    public Ability getAbility() { 
		 return this.ability; } 
    public void setAbility(Ability ability) { 
		 this.ability = ability; } 
    Ability ability;
    @JsonProperty("bombPlant") 
    public BombPlant getBombPlant() { 
		 return this.bombPlant; } 
    public void setBombPlant(BombPlant bombPlant) { 
		 this.bombPlant = bombPlant; } 
    BombPlant bombPlant;
    @JsonProperty("defendBombSite") 
    public DefendBombSite getDefendBombSite() { 
		 return this.defendBombSite; } 
    public void setDefendBombSite(DefendBombSite defendBombSite) { 
		 this.defendBombSite = defendBombSite; } 
    DefendBombSite defendBombSite;
    @JsonProperty("settingStatus") 
    public SettingStatus getSettingStatus() { 
		 return this.settingStatus; } 
    public void setSettingStatus(SettingStatus settingStatus) { 
		 this.settingStatus = settingStatus; } 
    SettingStatus settingStatus;
    @JsonProperty("versionString") 
    public String getVersionString() { 
		 return this.versionString; } 
    public void setVersionString(String versionString) { 
		 this.versionString = versionString; } 
    String versionString;
}
