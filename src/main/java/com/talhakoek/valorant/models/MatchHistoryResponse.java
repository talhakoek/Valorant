package com.talhakoek.valorant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchHistoryResponse {

    @JsonProperty("Subject")
    private String subject;

    @JsonProperty("BeginIndex")
    private int beginIndex;

    @JsonProperty("EndIndex")
    private int endIndex;

    @JsonProperty("Total")
    private int total;

    @JsonProperty("History")
    private List<Match> history;

    // Standard getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MatchHistoryResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public MatchHistoryResponse beginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
        return this;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public MatchHistoryResponse endIndex(int endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public MatchHistoryResponse total(int total) {
        this.total = total;
        return this;
    }

    public List<Match> getHistory() {
        return history;
    }

    public void setHistory(List<Match> history) {
        this.history = history;
    }

    public MatchHistoryResponse history(List<Match> history) {
        this.history = history;
        return this;
    }

    @Override
    public String toString() {
        return "MatchHistoryResponse{" +
                "subject='" + subject + '\'' +
                ", beginIndex=" + beginIndex +
                ", endIndex=" + endIndex +
                ", total=" + total +
                ", history=" + history +
                '}';
    }

    public static class Match {
        @JsonProperty("MatchID")
        private String matchID;

        @JsonProperty("GameStartTime")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "unix")
        private long gameStartTime;

        @JsonProperty("QueueID")
        private String queueID;

        @JsonInclude(JsonInclude.Include.NON_NULL)  // Only include matchDetailsResponse if it is not null
        @JsonProperty("Details")
        private MatchDetailsResponse matchDetailsResponse;  // New field to hold match details


        // Standard getters and setters
        public String getMatchID() {
            return matchID;
        }

        public void setMatchID(String matchID) {
            this.matchID = matchID;
        }

        public Match matchID(String matchID) {
            this.matchID = matchID;
            return this;
        }

        public long getGameStartTime() {
            return gameStartTime;
        }

        public void setGameStartTime(long gameStartTime) {
            this.gameStartTime = gameStartTime;
        }

        public Match gameStartTime(long gameStartTime) {
            this.gameStartTime = gameStartTime;
            return this;
        }

        public String getQueueID() {
            return queueID;
        }

        public void setQueueID(String queueID) {
            this.queueID = queueID;
        }

        public Match queueID(String queueID) {
            this.queueID = queueID;
            return this;
        }

        public MatchDetailsResponse getMatchDetailsResponse() {
            return matchDetailsResponse;
        }

        public void setMatchDetailsResponse(MatchDetailsResponse matchDetailsResponse) {
            this.matchDetailsResponse = matchDetailsResponse;
        }

        @Override
        public String toString() {
            return "Match{" +
                    "matchID='" + matchID + '\'' +
                    ", gameStartTime=" + gameStartTime +
                    ", queueID='" + queueID + '\'' +
                    ", matchDetailsResponse=" + (matchDetailsResponse != null ? matchDetailsResponse.toString() : "null") +
                    '}';
        }
    }
}
