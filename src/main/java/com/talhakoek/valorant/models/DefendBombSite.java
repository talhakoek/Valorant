package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefendBombSite{
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
    @JsonProperty("success") 
    public boolean getSuccess() { 
		 return this.success; } 
    public void setSuccess(boolean success) { 
		 this.success = success; } 
    boolean success;
}
