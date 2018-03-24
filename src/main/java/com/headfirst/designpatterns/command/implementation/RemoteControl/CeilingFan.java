package com.headfirst.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class CeilingFan implements Fan {

    private String room;


    public int getPreviousSpeed() {
        return oldFanSpeed;
    }

    private int oldFanSpeed;
    private int newFanSpeed;

    public CeilingFan(String room) {
        this.room = room;
    }

    public String on() {
        this.oldFanSpeed = OFF;
        this.newFanSpeed = ON;
        return this.room + " fan is switched on.";
    }

    public String off() {
        this.oldFanSpeed = this.newFanSpeed;
        this.newFanSpeed = OFF;
        return this.room + " fan is switched off.";
    }

    public String high() {
        this.oldFanSpeed = this.newFanSpeed;
        this.newFanSpeed = HIGH;
        return this.room + " fan is set to high.";
    }

    public String medium() {
        this.oldFanSpeed = this.newFanSpeed;
        this.newFanSpeed = MED;
        return this.room + " fan is set to medium.";
    }

    public String low() {
        this.oldFanSpeed = this.newFanSpeed;
        this.newFanSpeed = LOW;
        return this.room + " fan is set to low.";
    }
}
