package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class Stereo {

    public String on() {
        return "The stereo is turned ON.";
    }

    public String dvdMode() {
        return "The stereo is now set to DVD mode.";
    }

    public String setVolume() {
        return "The volume is set to 12.";
    }
}
