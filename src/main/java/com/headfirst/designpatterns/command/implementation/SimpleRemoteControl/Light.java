package com.headfirst.designpatterns.command.implementation.SimpleRemoteControl;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public class Light {

    private boolean isOn = false;
    private boolean isOff = true;

    public String on () throws CommandException {
        if (isOn) {
            throw new CommandException("Light is already turned ON.");
        }
        isOn = true;
        isOff = false;
        return "Light is switched ON..";
    }

    public String off() throws CommandException {
        if (isOff) {
            throw new CommandException("Light is already turned OFF.");
        }
        isOff = true;
        isOn = false;
        return "Light is switched OFF..";
    }
}
