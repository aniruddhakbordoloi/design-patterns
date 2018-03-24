package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class Hottub {

    public String on() {
        return "Hottub is turned on.";
    }

    public String temperature() {
        return "The temperature is set to 22.";
    }

    public String setWaterLevel() {
        return "The water level is set to 20 litres.";
    }
}
