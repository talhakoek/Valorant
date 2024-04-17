package com.talhakoek.valorant.models;

public class CurrentRank {
    int RankRating,CompetitiveTier;

    public CurrentRank(int rankRating, int competitiveTier) {
        RankRating = rankRating;
        CompetitiveTier = competitiveTier;
    }

    public int getRankRating() {
        return RankRating;
    }

    public void setRankRating(int rankRating) {
        RankRating = rankRating;
    }

    public int getCompetitiveTier() {
        return CompetitiveTier;
    }

    public void setCompetitiveTier(int competitiveTier) {
        CompetitiveTier = competitiveTier;
    }
}
