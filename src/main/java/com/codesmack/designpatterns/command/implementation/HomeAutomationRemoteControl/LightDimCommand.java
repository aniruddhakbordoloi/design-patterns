package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class LightDimCommand implements Command{
    private Light light;

    public LightDimCommand(Light light) {
        this.light = light;
    }

    public String execute() {
        return light.dim();
    }
}
