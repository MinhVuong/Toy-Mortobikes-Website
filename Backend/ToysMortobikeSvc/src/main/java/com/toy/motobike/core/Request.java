package com.toy.motobike.core;

/**
 *
 * @author LAP11292-local
 */
public class Request {
    private String time;
    private String data;
    private String signature;

    public Request() {
    }

    public Request(String time, String data, String signature) {
        this.time = time;
        this.data = data;
        this.signature = signature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
