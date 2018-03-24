package com.headfirst.designpatterns.command.implementation.SimpleRemoteControl;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    public String execute() throws CommandException {
        return light.on();
    }
}
