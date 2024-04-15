package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinishingDamage{
    @JsonProperty("damageType")
    public String getDamageType() { 
		 return this.damageType; } 
    public void setDamageType(String damageType) { 
		 this.damageType = damageType; } 
    String damageType;
    @JsonProperty("damageItem") 
    public String getDamageItem() { 
		 return this.damageItem; } 
    public void setDamageItem(String damageItem) { 
		 this.damageItem = damageItem; } 
    String damageItem;
    @JsonProperty("isSecondaryFireMode") 
    public boolean getIsSecondaryFireMode() { 
		 return this.isSecondaryFireMode; } 
    public void setIsSecondaryFireMode(boolean isSecondaryFireMode) { 
		 this.isSecondaryFireMode = isSecondaryFireMode; } 
    boolean isSecondaryFireMode;
}
