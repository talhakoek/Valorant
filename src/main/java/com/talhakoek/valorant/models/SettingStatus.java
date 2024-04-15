package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SettingStatus{
    @JsonProperty("isMouseSensitivityDefault")
    public boolean getIsMouseSensitivityDefault() { 
		 return this.isMouseSensitivityDefault; } 
    public void setIsMouseSensitivityDefault(boolean isMouseSensitivityDefault) { 
		 this.isMouseSensitivityDefault = isMouseSensitivityDefault; } 
    boolean isMouseSensitivityDefault;
    @JsonProperty("isCrosshairDefault") 
    public boolean getIsCrosshairDefault() { 
		 return this.isCrosshairDefault; } 
    public void setIsCrosshairDefault(boolean isCrosshairDefault) { 
		 this.isCrosshairDefault = isCrosshairDefault; } 
    boolean isCrosshairDefault;
}
