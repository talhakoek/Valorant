package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XpModification{
    @JsonProperty("Value")
    public double getValue() { 
		 return this.value; } 
    public void setValue(double value) { 
		 this.value = value; } 
    double value;
    @JsonProperty("ID") 
    public String getID() { 
		 return this.iD; } 
    public void setID(String iD) { 
		 this.iD = iD; } 
    String iD;
}
