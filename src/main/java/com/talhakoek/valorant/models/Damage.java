package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Damage{
    @JsonProperty("receiver")
    public String getReceiver() { 
		 return this.receiver; } 
    public void setReceiver(String receiver) { 
		 this.receiver = receiver; } 
    String receiver;
    @JsonProperty("damage") 
    public int getDamage() { 
		 return this.damage; } 
    public void setDamage(int damage) { 
		 this.damage = damage; } 
    int damage;
    @JsonProperty("legshots") 
    public int getLegshots() { 
		 return this.legshots; } 
    public void setLegshots(int legshots) { 
		 this.legshots = legshots; } 
    int legshots;
    @JsonProperty("bodyshots") 
    public int getBodyshots() { 
		 return this.bodyshots; } 
    public void setBodyshots(int bodyshots) { 
		 this.bodyshots = bodyshots; } 
    int bodyshots;
    @JsonProperty("headshots") 
    public int getHeadshots() { 
		 return this.headshots; } 
    public void setHeadshots(int headshots) { 
		 this.headshots = headshots; } 
    int headshots;
}
