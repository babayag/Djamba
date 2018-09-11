package com.djamba;

public class FbService {

    private String helloMessage = "message hello";

    public FbService(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
