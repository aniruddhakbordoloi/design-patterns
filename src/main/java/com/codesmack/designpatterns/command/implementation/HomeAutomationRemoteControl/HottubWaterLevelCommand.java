package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class HottubWaterLevelCommand implements Command {
    private Hottub hottub;

    public HottubWaterLevelCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public String execute() {
        return hottub.setWaterLevel();
    }
}
