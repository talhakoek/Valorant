package com.talhakoek.valorant.models;

public class GameModes {
    String assetpath,UUID;

    public GameModes(String assetpath, String UUID) {
        this.assetpath = assetpath;
        this.UUID = UUID;
    }

    public String getAssetpath() {
        return assetpath;
    }

    public void setAssetpath(String assetpath) {
        this.assetpath = assetpath;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
