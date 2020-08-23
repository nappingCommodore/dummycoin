package com.dummycoin.dummycoin.model;

import com.dummycoin.dummycoin.util.StringUtil;

import java.util.Date;

public class Block {
    private String hash;
    private String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = this.calculateHash();
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getData() {
        return data;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String calculateHash() {
        return StringUtil.applySHA256(this.previousHash + Long.toString(this.timeStamp) + this.data);
    }
}
