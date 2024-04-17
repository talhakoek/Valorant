package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class CompetitiveUpdates {
    @JsonProperty("Version")
    public int getVersion() {
        return this.version; }
    public void setVersion(int version) {
        this.version = version; }
    int version;
    @JsonProperty("Subject")
    public String getSubject() {
        return this.subject; }
    public void setSubject(String subject) {
        this.subject = subject; }
    String subject;
    @JsonProperty("Matches")
    public ArrayList<Matches> getMatches() {
        return this.matches; }
    public void setMatches(ArrayList<Matches> matches) {
        this.matches = matches; }
    ArrayList<Matches> matches;

}

