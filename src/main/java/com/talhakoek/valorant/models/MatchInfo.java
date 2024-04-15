package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchInfo{
    @JsonProperty("matchId")
    public String getMatchId() { 
		 return this.matchId; } 
    public void setMatchId(String matchId) { 
		 this.matchId = matchId; } 
    String matchId;
    @JsonProperty("mapId") 
    public String getMapId() { 
		 return this.mapId; } 
    public void setMapId(String mapId) { 
		 this.mapId = mapId; } 
    String mapId;
    @JsonProperty("gamePodId") 
    public String getGamePodId() { 
		 return this.gamePodId; } 
    public void setGamePodId(String gamePodId) { 
		 this.gamePodId = gamePodId; } 
    String gamePodId;
    @JsonProperty("gameLoopZone") 
    public String getGameLoopZone() { 
		 return this.gameLoopZone; } 
    public void setGameLoopZone(String gameLoopZone) { 
		 this.gameLoopZone = gameLoopZone; } 
    String gameLoopZone;
    @JsonProperty("gameServerAddress") 
    public String getGameServerAddress() { 
		 return this.gameServerAddress; } 
    public void setGameServerAddress(String gameServerAddress) { 
		 this.gameServerAddress = gameServerAddress; } 
    String gameServerAddress;
    @JsonProperty("gameVersion") 
    public String getGameVersion() { 
		 return this.gameVersion; } 
    public void setGameVersion(String gameVersion) { 
		 this.gameVersion = gameVersion; } 
    String gameVersion;
    @JsonProperty("gameLengthMillis") 
    public int getGameLengthMillis() { 
		 return this.gameLengthMillis; } 
    public void setGameLengthMillis(int gameLengthMillis) { 
		 this.gameLengthMillis = gameLengthMillis; } 
    int gameLengthMillis;
    @JsonProperty("gameStartMillis") 
    public long getGameStartMillis() { 
		 return this.gameStartMillis; } 
    public void setGameStartMillis(long gameStartMillis) { 
		 this.gameStartMillis = gameStartMillis; } 
    long gameStartMillis;
    @JsonProperty("provisioningFlowID") 
    public String getProvisioningFlowID() { 
		 return this.provisioningFlowID; } 
    public void setProvisioningFlowID(String provisioningFlowID) { 
		 this.provisioningFlowID = provisioningFlowID; } 
    String provisioningFlowID;
    @JsonProperty("isCompleted") 
    public boolean getIsCompleted() { 
		 return this.isCompleted; } 
    public void setIsCompleted(boolean isCompleted) { 
		 this.isCompleted = isCompleted; } 
    boolean isCompleted;
    @JsonProperty("customGameName") 
    public String getCustomGameName() { 
		 return this.customGameName; } 
    public void setCustomGameName(String customGameName) { 
		 this.customGameName = customGameName; } 
    String customGameName;
    @JsonProperty("forcePostProcessing") 
    public boolean getForcePostProcessing() { 
		 return this.forcePostProcessing; } 
    public void setForcePostProcessing(boolean forcePostProcessing) { 
		 this.forcePostProcessing = forcePostProcessing; } 
    boolean forcePostProcessing;
    @JsonProperty("queueID") 
    public String getQueueID() { 
		 return this.queueID; } 
    public void setQueueID(String queueID) { 
		 this.queueID = queueID; } 
    String queueID;
    @JsonProperty("gameMode") 
    public String getGameMode() { 
		 return this.gameMode; } 
    public void setGameMode(String gameMode) { 
		 this.gameMode = gameMode; } 
    String gameMode;
    @JsonProperty("isRanked") 
    public boolean getIsRanked() { 
		 return this.isRanked; } 
    public void setIsRanked(boolean isRanked) { 
		 this.isRanked = isRanked; } 
    boolean isRanked;
    @JsonProperty("isMatchSampled") 
    public boolean getIsMatchSampled() { 
		 return this.isMatchSampled; } 
    public void setIsMatchSampled(boolean isMatchSampled) { 
		 this.isMatchSampled = isMatchSampled; } 
    boolean isMatchSampled;
    @JsonProperty("seasonId") 
    public String getSeasonId() { 
		 return this.seasonId; } 
    public void setSeasonId(String seasonId) { 
		 this.seasonId = seasonId; } 
    String seasonId;
    @JsonProperty("completionState") 
    public String getCompletionState() { 
		 return this.completionState; } 
    public void setCompletionState(String completionState) { 
		 this.completionState = completionState; } 
    String completionState;
    @JsonProperty("platformType") 
    public String getPlatformType() { 
		 return this.platformType; } 
    public void setPlatformType(String platformType) { 
		 this.platformType = platformType; } 
    String platformType;
    @JsonProperty("premierMatchInfo") 
    public PremierMatchInfo getPremierMatchInfo() { 
		 return this.premierMatchInfo; } 
    public void setPremierMatchInfo(PremierMatchInfo premierMatchInfo) { 
		 this.premierMatchInfo = premierMatchInfo; } 
    PremierMatchInfo premierMatchInfo;
    @JsonProperty("partyRRPenalties") 
    public PartyRRPenalties getPartyRRPenalties() { 
		 return this.partyRRPenalties; } 
    public void setPartyRRPenalties(PartyRRPenalties partyRRPenalties) { 
		 this.partyRRPenalties = partyRRPenalties; } 
    PartyRRPenalties partyRRPenalties;
    @JsonProperty("shouldMatchDisablePenalties") 
    public boolean getShouldMatchDisablePenalties() { 
		 return this.shouldMatchDisablePenalties; } 
    public void setShouldMatchDisablePenalties(boolean shouldMatchDisablePenalties) { 
		 this.shouldMatchDisablePenalties = shouldMatchDisablePenalties; } 
    boolean shouldMatchDisablePenalties;
}
