package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    public String execute() {
        return light.on();
    }

    public String undo() {
        return light.off();
    }
}
