package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefusePlayerLocation{
    @JsonProperty("subject")
    public String getSubject() { 
		 return this.subject; } 
    public void setSubject(String subject) { 
		 this.subject = subject; } 
    String subject;
    @JsonProperty("viewRadians") 
    public double getViewRadians() { 
		 return this.viewRadians; } 
    public void setViewRadians(double viewRadians) { 
		 this.viewRadians = viewRadians; } 
    double viewRadians;
    @JsonProperty("location") 
    public Location getLocation() { 
		 return this.location; } 
    public void setLocation(Location location) { 
		 this.location = location; } 
    Location location;
}
