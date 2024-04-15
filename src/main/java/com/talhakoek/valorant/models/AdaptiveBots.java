package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdaptiveBots{
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
    @JsonProperty("adaptiveBotAverageDurationMillisAllAttempts") 
    public int getAdaptiveBotAverageDurationMillisAllAttempts() { 
		 return this.adaptiveBotAverageDurationMillisAllAttempts; } 
    public void setAdaptiveBotAverageDurationMillisAllAttempts(int adaptiveBotAverageDurationMillisAllAttempts) { 
		 this.adaptiveBotAverageDurationMillisAllAttempts = adaptiveBotAverageDurationMillisAllAttempts; } 
    int adaptiveBotAverageDurationMillisAllAttempts;
    @JsonProperty("adaptiveBotAverageDurationMillisFirstAttempt") 
    public int getAdaptiveBotAverageDurationMillisFirstAttempt() { 
		 return this.adaptiveBotAverageDurationMillisFirstAttempt; } 
    public void setAdaptiveBotAverageDurationMillisFirstAttempt(int adaptiveBotAverageDurationMillisFirstAttempt) { 
		 this.adaptiveBotAverageDurationMillisFirstAttempt = adaptiveBotAverageDurationMillisFirstAttempt; } 
    int adaptiveBotAverageDurationMillisFirstAttempt;
    @JsonProperty("killDetailsFirstAttempt") 
    public Object getKillDetailsFirstAttempt() { 
		 return this.killDetailsFirstAttempt; } 
    public void setKillDetailsFirstAttempt(Object killDetailsFirstAttempt) { 
		 this.killDetailsFirstAttempt = killDetailsFirstAttempt; } 
    Object killDetailsFirstAttempt;
}
