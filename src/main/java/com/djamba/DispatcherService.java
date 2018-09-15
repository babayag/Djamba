package com.djamba;

public class DispatcherService {

    private String helloMessage = "message hello";

    public DispatcherService(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
