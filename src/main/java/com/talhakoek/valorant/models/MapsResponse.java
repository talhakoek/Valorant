package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MapsResponse {
    @JsonProperty("status")
    public int getStatus() { 
		 return this.status; } 
    public void setStatus(int status) { 
		 this.status = status; } 
    int status;
    @JsonProperty("data") 
    public ArrayList<Datum> getData() {
		 return this.data; } 
    public void setData(ArrayList<Datum> data) { 
		 this.data = data; } 
    ArrayList<Datum> data;
}
