package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformInfo{
    @JsonProperty("platformType")
    public String getPlatformType() { 
		 return this.platformType; } 
    public void setPlatformType(String platformType) { 
		 this.platformType = platformType; } 
    String platformType;
    @JsonProperty("platformOS") 
    public String getPlatformOS() { 
		 return this.platformOS; } 
    public void setPlatformOS(String platformOS) { 
		 this.platformOS = platformOS; } 
    String platformOS;
    @JsonProperty("platformOSVersion") 
    public String getPlatformOSVersion() { 
		 return this.platformOSVersion; } 
    public void setPlatformOSVersion(String platformOSVersion) { 
		 this.platformOSVersion = platformOSVersion; } 
    String platformOSVersion;
    @JsonProperty("platformChipset") 
    public String getPlatformChipset() { 
		 return this.platformChipset; } 
    public void setPlatformChipset(String platformChipset) { 
		 this.platformChipset = platformChipset; } 
    String platformChipset;
}
