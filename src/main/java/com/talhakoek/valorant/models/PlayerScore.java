package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerScore{
    @JsonProperty("subject")
    public String getSubject() { 
		 return this.subject; } 
    public void setSubject(String subject) { 
		 this.subject = subject; } 
    String subject;
    @JsonProperty("score") 
    public int getScore() { 
		 return this.score; } 
    public void setScore(int score) { 
		 this.score = score; } 
    int score;
}
