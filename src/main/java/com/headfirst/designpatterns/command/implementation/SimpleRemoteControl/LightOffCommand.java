package com.headfirst.designpatterns.command.implementation.SimpleRemoteControl;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public String execute() throws CommandException {
       return light.off();
    }
}
