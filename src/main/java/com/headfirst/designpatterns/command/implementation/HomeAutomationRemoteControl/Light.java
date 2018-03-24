package com.headfirst.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class Light {
    public String on() {
        return "Lights are switched on.";
    }

    public String dim() {
        return "Lights are set to dim.";
    }
}
