package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class AirCondition {
    public String on() {
        return "The air condition is turned on.";
    }

    public String setTemperature() {
        return "The AC has been set to the desired temperature.";
    }
}
