package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BehaviorFactors{
    @JsonProperty("afkRounds")
    public int getAfkRounds() { 
		 return this.afkRounds; } 
    public void setAfkRounds(int afkRounds) { 
		 this.afkRounds = afkRounds; } 
    int afkRounds;
    @JsonProperty("collisions") 
    public double getCollisions() { 
		 return this.collisions; } 
    public void setCollisions(double collisions) { 
		 this.collisions = collisions; } 
    double collisions;
    @JsonProperty("commsRatingRecovery") 
    public int getCommsRatingRecovery() { 
		 return this.commsRatingRecovery; } 
    public void setCommsRatingRecovery(int commsRatingRecovery) { 
		 this.commsRatingRecovery = commsRatingRecovery; } 
    int commsRatingRecovery;
    @JsonProperty("damageParticipationOutgoing") 
    public int getDamageParticipationOutgoing() { 
		 return this.damageParticipationOutgoing; } 
    public void setDamageParticipationOutgoing(int damageParticipationOutgoing) { 
		 this.damageParticipationOutgoing = damageParticipationOutgoing; } 
    int damageParticipationOutgoing;
    @JsonProperty("friendlyFireIncoming") 
    public int getFriendlyFireIncoming() { 
		 return this.friendlyFireIncoming; } 
    public void setFriendlyFireIncoming(int friendlyFireIncoming) { 
		 this.friendlyFireIncoming = friendlyFireIncoming; } 
    int friendlyFireIncoming;
    @JsonProperty("friendlyFireOutgoing") 
    public int getFriendlyFireOutgoing() { 
		 return this.friendlyFireOutgoing; } 
    public void setFriendlyFireOutgoing(int friendlyFireOutgoing) { 
		 this.friendlyFireOutgoing = friendlyFireOutgoing; } 
    int friendlyFireOutgoing;
    @JsonProperty("mouseMovement") 
    public int getMouseMovement() { 
		 return this.mouseMovement; } 
    public void setMouseMovement(int mouseMovement) { 
		 this.mouseMovement = mouseMovement; } 
    int mouseMovement;
    @JsonProperty("selfDamage") 
    public int getSelfDamage() { 
		 return this.selfDamage; } 
    public void setSelfDamage(int selfDamage) { 
		 this.selfDamage = selfDamage; } 
    int selfDamage;
    @JsonProperty("stayedInSpawnRounds") 
    public int getStayedInSpawnRounds() { 
		 return this.stayedInSpawnRounds; } 
    public void setStayedInSpawnRounds(int stayedInSpawnRounds) { 
		 this.stayedInSpawnRounds = stayedInSpawnRounds; } 
    int stayedInSpawnRounds;
}
