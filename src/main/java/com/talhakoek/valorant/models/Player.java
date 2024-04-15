package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Player{
    @JsonProperty("subject")
    public String getSubject() { 
		 return this.subject; } 
    public void setSubject(String subject) { 
		 this.subject = subject; } 
    String subject;
    @JsonProperty("gameName") 
    public String getGameName() { 
		 return this.gameName; } 
    public void setGameName(String gameName) { 
		 this.gameName = gameName; } 
    String gameName;
    @JsonProperty("tagLine") 
    public String getTagLine() { 
		 return this.tagLine; } 
    public void setTagLine(String tagLine) { 
		 this.tagLine = tagLine; } 
    String tagLine;
    @JsonProperty("platformInfo") 
    public PlatformInfo getPlatformInfo() { 
		 return this.platformInfo; } 
    public void setPlatformInfo(PlatformInfo platformInfo) { 
		 this.platformInfo = platformInfo; } 
    PlatformInfo platformInfo;
    @JsonProperty("teamId") 
    public String getTeamId() { 
		 return this.teamId; } 
    public void setTeamId(String teamId) { 
		 this.teamId = teamId; } 
    String teamId;
    @JsonProperty("partyId") 
    public String getPartyId() { 
		 return this.partyId; } 
    public void setPartyId(String partyId) { 
		 this.partyId = partyId; } 
    String partyId;
    @JsonProperty("characterId") 
    public String getCharacterId() { 
		 return this.characterId; } 
    public void setCharacterId(String characterId) { 
		 this.characterId = characterId; } 
    String characterId;
    @JsonProperty("stats") 
    public Stats getStats() { 
		 return this.stats; } 
    public void setStats(Stats stats) { 
		 this.stats = stats; } 
    Stats stats;
    @JsonProperty("roundDamage") 
    public ArrayList<RoundDamage> getRoundDamage() {
		 return this.roundDamage; } 
    public void setRoundDamage(ArrayList<RoundDamage> roundDamage) { 
		 this.roundDamage = roundDamage; } 
    ArrayList<RoundDamage> roundDamage;
    @JsonProperty("competitiveTier") 
    public int getCompetitiveTier() { 
		 return this.competitiveTier; } 
    public void setCompetitiveTier(int competitiveTier) { 
		 this.competitiveTier = competitiveTier; } 
    int competitiveTier;
    @JsonProperty("isObserver") 
    public boolean getIsObserver() { 
		 return this.isObserver; } 
    public void setIsObserver(boolean isObserver) { 
		 this.isObserver = isObserver; } 
    boolean isObserver;
    @JsonProperty("playerCard") 
    public String getPlayerCard() { 
		 return this.playerCard; } 
    public void setPlayerCard(String playerCard) { 
		 this.playerCard = playerCard; } 
    String playerCard;
    @JsonProperty("playerTitle") 
    public String getPlayerTitle() { 
		 return this.playerTitle; } 
    public void setPlayerTitle(String playerTitle) { 
		 this.playerTitle = playerTitle; } 
    String playerTitle;
    @JsonProperty("preferredLevelBorder") 
    public String getPreferredLevelBorder() { 
		 return this.preferredLevelBorder; } 
    public void setPreferredLevelBorder(String preferredLevelBorder) { 
		 this.preferredLevelBorder = preferredLevelBorder; } 
    String preferredLevelBorder;
    @JsonProperty("accountLevel") 
    public int getAccountLevel() { 
		 return this.accountLevel; } 
    public void setAccountLevel(int accountLevel) { 
		 this.accountLevel = accountLevel; } 
    int accountLevel;
    @JsonProperty("sessionPlaytimeMinutes") 
    public int getSessionPlaytimeMinutes() { 
		 return this.sessionPlaytimeMinutes; } 
    public void setSessionPlaytimeMinutes(int sessionPlaytimeMinutes) { 
		 this.sessionPlaytimeMinutes = sessionPlaytimeMinutes; } 
    int sessionPlaytimeMinutes;
    @JsonProperty("xpModifications") 
    public ArrayList<XpModification> getXpModifications() { 
		 return this.xpModifications; } 
    public void setXpModifications(ArrayList<XpModification> xpModifications) { 
		 this.xpModifications = xpModifications; } 
    ArrayList<XpModification> xpModifications;
    @JsonProperty("behaviorFactors") 
    public BehaviorFactors getBehaviorFactors() { 
		 return this.behaviorFactors; } 
    public void setBehaviorFactors(BehaviorFactors behaviorFactors) { 
		 this.behaviorFactors = behaviorFactors; } 
    BehaviorFactors behaviorFactors;
    @JsonProperty("newPlayerExperienceDetails") 
    public NewPlayerExperienceDetails getNewPlayerExperienceDetails() { 
		 return this.newPlayerExperienceDetails; } 
    public void setNewPlayerExperienceDetails(NewPlayerExperienceDetails newPlayerExperienceDetails) { 
		 this.newPlayerExperienceDetails = newPlayerExperienceDetails; } 
    NewPlayerExperienceDetails newPlayerExperienceDetails;
}
