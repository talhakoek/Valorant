package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Callout{
    @JsonProperty("regionName")
    public String getRegionName() { 
		 return this.regionName; } 
    public void setRegionName(String regionName) { 
		 this.regionName = regionName; } 
    String regionName;
    @JsonProperty("superRegionName") 
    public String getSuperRegionName() { 
		 return this.superRegionName; } 
    public void setSuperRegionName(String superRegionName) { 
		 this.superRegionName = superRegionName; } 
    String superRegionName;
    @JsonProperty("location") 
    public Location getLocation() { 
		 return this.location; } 
    public void setLocation(Location location) { 
		 this.location = location; } 
    Location location;
}
