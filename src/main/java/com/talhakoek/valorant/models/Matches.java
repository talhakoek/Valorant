package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Matches{
    @JsonProperty("MatchID")
    public String getMatchID() {
        return this.matchID; }
    public void setMatchID(String matchID) {
        this.matchID = matchID; }
    String matchID;
    @JsonProperty("MapID")
    public String getMapID() {
        return this.mapID; }
    public void setMapID(String mapID) {
        this.mapID = mapID; }
    String mapID;
    @JsonProperty("SeasonID")
    public String getSeasonID() {
        return this.seasonID; }
    public void setSeasonID(String seasonID) {
        this.seasonID = seasonID; }
    String seasonID;
    @JsonProperty("MatchStartTime")
    public long getMatchStartTime() {
        return this.matchStartTime; }
    public void setMatchStartTime(long matchStartTime) {
        this.matchStartTime = matchStartTime; }
    long matchStartTime;
    @JsonProperty("TierAfterUpdate")
    public int getTierAfterUpdate() {
        return this.tierAfterUpdate; }
    public void setTierAfterUpdate(int tierAfterUpdate) {
        this.tierAfterUpdate = tierAfterUpdate; }
    int tierAfterUpdate;
    @JsonProperty("TierBeforeUpdate")
    public int getTierBeforeUpdate() {
        return this.tierBeforeUpdate; }
    public void setTierBeforeUpdate(int tierBeforeUpdate) {
        this.tierBeforeUpdate = tierBeforeUpdate; }
    int tierBeforeUpdate;
    @JsonProperty("RankedRatingAfterUpdate")
    public int getRankedRatingAfterUpdate() {
        return this.rankedRatingAfterUpdate; }
    public void setRankedRatingAfterUpdate(int rankedRatingAfterUpdate) {
        this.rankedRatingAfterUpdate = rankedRatingAfterUpdate; }
    int rankedRatingAfterUpdate;
    @JsonProperty("RankedRatingBeforeUpdate")
    public int getRankedRatingBeforeUpdate() {
        return this.rankedRatingBeforeUpdate; }
    public void setRankedRatingBeforeUpdate(int rankedRatingBeforeUpdate) {
        this.rankedRatingBeforeUpdate = rankedRatingBeforeUpdate; }
    int rankedRatingBeforeUpdate;
    @JsonProperty("RankedRatingEarned")
    public int getRankedRatingEarned() {
        return this.rankedRatingEarned; }
    public void setRankedRatingEarned(int rankedRatingEarned) {
        this.rankedRatingEarned = rankedRatingEarned; }
    int rankedRatingEarned;
    @JsonProperty("RankedRatingPerformanceBonus")
    public int getRankedRatingPerformanceBonus() {
        return this.rankedRatingPerformanceBonus; }
    public void setRankedRatingPerformanceBonus(int rankedRatingPerformanceBonus) {
        this.rankedRatingPerformanceBonus = rankedRatingPerformanceBonus; }
    int rankedRatingPerformanceBonus;
    @JsonProperty("CompetitiveMovement")
    public String getCompetitiveMovement() {
        return this.competitiveMovement; }
    public void setCompetitiveMovement(String competitiveMovement) {
        this.competitiveMovement = competitiveMovement; }
    String competitiveMovement;
    @JsonProperty("AFKPenalty")
    public int getAFKPenalty() {
        return this.aFKPenalty; }
    public void setAFKPenalty(int aFKPenalty) {
        this.aFKPenalty = aFKPenalty; }
    int aFKPenalty;
}
