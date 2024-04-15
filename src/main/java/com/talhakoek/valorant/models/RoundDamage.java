package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoundDamage{
    @JsonProperty("round")
    public int getRound() { 
		 return this.round; } 
    public void setRound(int round) { 
		 this.round = round; } 
    int round;
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
}
