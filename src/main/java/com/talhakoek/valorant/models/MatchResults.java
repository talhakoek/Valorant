package com.talhakoek.valorant.models;

public class MatchResults {
    String score;
    Boolean won;
    String agentID;
    int kill;
    int death;
    int assist;
    int CompetitiveTier;

    public int getCompetitiveTier() {
        return CompetitiveTier;
    }

    public void setCompetitiveTier(int CompetitiveTier) {
        this.CompetitiveTier = CompetitiveTier;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    int playerScore;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean getWon() {
        return won;
    }

    public void setWon(Boolean won) {
        this.won = won;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
