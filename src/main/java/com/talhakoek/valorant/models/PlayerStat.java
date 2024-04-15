package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PlayerStat{
    @JsonProperty("subject")
    public String getSubject() { 
		 return this.subject; } 
    public void setSubject(String subject) { 
		 this.subject = subject; } 
    String subject;
    @JsonProperty("kills") 
    public ArrayList<Kill> getKills() { 
		 return this.kills; } 
    public void setKills(ArrayList<Kill> kills) { 
		 this.kills = kills; } 
    ArrayList<Kill> kills;
    @JsonProperty("damage") 
    public ArrayList<Damage> getDamage() { 
		 return this.damage; } 
    public void setDamage(ArrayList<Damage> damage) { 
		 this.damage = damage; } 
    ArrayList<Damage> damage;
    @JsonProperty("score") 
    public int getScore() { 
		 return this.score; } 
    public void setScore(int score) { 
		 this.score = score; } 
    int score;
    @JsonProperty("economy") 
    public Economy getEconomy() { 
		 return this.economy; } 
    public void setEconomy(Economy economy) { 
		 this.economy = economy; } 
    Economy economy;
    @JsonProperty("ability") 
    public Ability getAbility() { 
		 return this.ability; } 
    public void setAbility(Ability ability) { 
		 this.ability = ability; } 
    Ability ability;
    @JsonProperty("wasAfk") 
    public boolean getWasAfk() { 
		 return this.wasAfk; } 
    public void setWasAfk(boolean wasAfk) { 
		 this.wasAfk = wasAfk; } 
    boolean wasAfk;
    @JsonProperty("wasPenalized") 
    public boolean getWasPenalized() { 
		 return this.wasPenalized; } 
    public void setWasPenalized(boolean wasPenalized) { 
		 this.wasPenalized = wasPenalized; } 
    boolean wasPenalized;
    @JsonProperty("stayedInSpawn") 
    public boolean getStayedInSpawn() { 
		 return this.stayedInSpawn; } 
    public void setStayedInSpawn(boolean stayedInSpawn) { 
		 this.stayedInSpawn = stayedInSpawn; } 
    boolean stayedInSpawn;
}
