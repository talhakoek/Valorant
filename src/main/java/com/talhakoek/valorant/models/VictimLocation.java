package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VictimLocation{
    @JsonProperty("x")
    public int getX() { 
		 return this.x; } 
    public void setX(int x) { 
		 this.x = x; } 
    int x;
    @JsonProperty("y") 
    public int getY() { 
		 return this.y; } 
    public void setY(int y) { 
		 this.y = y; } 
    int y;
}
