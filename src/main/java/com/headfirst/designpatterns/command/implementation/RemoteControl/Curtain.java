package com.headfirst.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class Curtain {
    private String room;

    public Curtain(String room) {
        this.room = room;
    }

    public String pullDown() {
        return this.room + " curtains are pulled down.";
    }

    public String pullUp() {
        return this.room + " curtains are pulled up.";
    }
}
