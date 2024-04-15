package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Economy{
    @JsonProperty("loadoutValue")
    public int getLoadoutValue() { 
		 return this.loadoutValue; } 
    public void setLoadoutValue(int loadoutValue) { 
		 this.loadoutValue = loadoutValue; } 
    int loadoutValue;
    @JsonProperty("weapon") 
    public String getWeapon() { 
		 return this.weapon; } 
    public void setWeapon(String weapon) { 
		 this.weapon = weapon; } 
    String weapon;
    @JsonProperty("armor") 
    public String getArmor() { 
		 return this.armor; } 
    public void setArmor(String armor) { 
		 this.armor = armor; } 
    String armor;
    @JsonProperty("remaining") 
    public int getRemaining() { 
		 return this.remaining; } 
    public void setRemaining(int remaining) { 
		 this.remaining = remaining; } 
    int remaining;
    @JsonProperty("spent") 
    public int getSpent() { 
		 return this.spent; } 
    public void setSpent(int spent) { 
		 this.spent = spent; } 
    int spent;
}
