package com.talhakoek.valorant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Member{
    @JsonProperty("Subject")
    public String getSubject() {
        return this.subject; }
    public void setSubject(String subject) {
        this.subject = subject; }
    String subject;
}
