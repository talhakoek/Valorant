package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Datum{
    @JsonProperty("uuid")
    public String getUuid() { 
		 return this.uuid; } 
    public void setUuid(String uuid) { 
		 this.uuid = uuid; } 
    String uuid;
    @JsonProperty("displayName") 
    public String getDisplayName() { 
		 return this.displayName; } 
    public void setDisplayName(String displayName) { 
		 this.displayName = displayName; } 
    String displayName;
    @JsonProperty("narrativeDescription") 
    public String getNarrativeDescription() { 
		 return this.narrativeDescription; } 
    public void setNarrativeDescription(String narrativeDescription) { 
		 this.narrativeDescription = narrativeDescription; } 
    String narrativeDescription;
    @JsonProperty("tacticalDescription") 
    public String getTacticalDescription() { 
		 return this.tacticalDescription; } 
    public void setTacticalDescription(String tacticalDescription) { 
		 this.tacticalDescription = tacticalDescription; } 
    String tacticalDescription;
    @JsonProperty("coordinates") 
    public String getCoordinates() { 
		 return this.coordinates; } 
    public void setCoordinates(String coordinates) { 
		 this.coordinates = coordinates; } 
    String coordinates;
    @JsonProperty("displayIcon") 
    public String getDisplayIcon() { 
		 return this.displayIcon; } 
    public void setDisplayIcon(String displayIcon) { 
		 this.displayIcon = displayIcon; } 
    String displayIcon;
    @JsonProperty("listViewIcon") 
    public String getListViewIcon() { 
		 return this.listViewIcon; } 
    public void setListViewIcon(String listViewIcon) { 
		 this.listViewIcon = listViewIcon; } 
    String listViewIcon;
    @JsonProperty("listViewIconTall") 
    public String getListViewIconTall() { 
		 return this.listViewIconTall; } 
    public void setListViewIconTall(String listViewIconTall) { 
		 this.listViewIconTall = listViewIconTall; } 
    String listViewIconTall;
    @JsonProperty("splash") 
    public String getSplash() { 
		 return this.splash; } 
    public void setSplash(String splash) { 
		 this.splash = splash; } 
    String splash;
    @JsonProperty("stylizedBackgroundImage") 
    public String getStylizedBackgroundImage() { 
		 return this.stylizedBackgroundImage; } 
    public void setStylizedBackgroundImage(String stylizedBackgroundImage) { 
		 this.stylizedBackgroundImage = stylizedBackgroundImage; } 
    String stylizedBackgroundImage;
    @JsonProperty("premierBackgroundImage") 
    public String getPremierBackgroundImage() { 
		 return this.premierBackgroundImage; } 
    public void setPremierBackgroundImage(String premierBackgroundImage) { 
		 this.premierBackgroundImage = premierBackgroundImage; } 
    String premierBackgroundImage;
    @JsonProperty("assetPath") 
    public String getAssetPath() { 
		 return this.assetPath; } 
    public void setAssetPath(String assetPath) { 
		 this.assetPath = assetPath; } 
    String assetPath;
    @JsonProperty("mapUrl") 
    public String getMapUrl() { 
		 return this.mapUrl; } 
    public void setMapUrl(String mapUrl) { 
		 this.mapUrl = mapUrl; } 
    String mapUrl;
    @JsonProperty("xMultiplier") 
    public double getXMultiplier() { 
		 return this.xMultiplier; } 
    public void setXMultiplier(double xMultiplier) { 
		 this.xMultiplier = xMultiplier; } 
    double xMultiplier;
    @JsonProperty("yMultiplier") 
    public double getYMultiplier() { 
		 return this.yMultiplier; } 
    public void setYMultiplier(double yMultiplier) { 
		 this.yMultiplier = yMultiplier; } 
    double yMultiplier;
    @JsonProperty("xScalarToAdd") 
    public double getXScalarToAdd() { 
		 return this.xScalarToAdd; } 
    public void setXScalarToAdd(double xScalarToAdd) { 
		 this.xScalarToAdd = xScalarToAdd; } 
    double xScalarToAdd;
    @JsonProperty("yScalarToAdd") 
    public double getYScalarToAdd() { 
		 return this.yScalarToAdd; } 
    public void setYScalarToAdd(double yScalarToAdd) { 
		 this.yScalarToAdd = yScalarToAdd; } 
    double yScalarToAdd;
    @JsonProperty("callouts") 
    public ArrayList<Callout> getCallouts() {
		 return this.callouts; } 
    public void setCallouts(ArrayList<Callout> callouts) { 
		 this.callouts = callouts; } 
    ArrayList<Callout> callouts;
}
