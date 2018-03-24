package com.headfirst.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class Light {
    String light;

    public Light(String light) {
        this.light = light;
    }

    public String on() {
        return this.light + " light is switched on.";
    }

    public String off() {
        return this.light + " light is switched off.";
    }
}
