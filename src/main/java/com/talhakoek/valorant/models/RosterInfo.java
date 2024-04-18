package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class RosterInfo{
    @JsonProperty("RosterID")
    public String getRosterID() {
        return this.rosterID; }
    public void setRosterID(String rosterID) {
        this.rosterID = rosterID; }
    String rosterID;
    @JsonProperty("Members")
    public ArrayList<Member> getMembers() {
        return this.members; }
    public void setMembers(ArrayList<Member> members) {
        this.members = members; }
    ArrayList<Member> members;
    @JsonProperty("Name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("Tag")
    public String getTag() {
        return this.tag; }
    public void setTag(String tag) {
        this.tag = tag; }
    String tag;
    @JsonProperty("Icon")
    public String getIcon() {
        return this.icon; }
    public void setIcon(String icon) {
        this.icon = icon; }
    String icon;
    @JsonProperty("PrimaryColor")
    public String getPrimaryColor() {
        return this.primaryColor; }
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor; }
    String primaryColor;
    @JsonProperty("SecondaryColor")
    public String getSecondaryColor() {
        return this.secondaryColor; }
    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor; }
    String secondaryColor;
    @JsonProperty("TertiaryColor")
    public String getTertiaryColor() {
        return this.tertiaryColor; }
    public void setTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor; }
    String tertiaryColor;
}


