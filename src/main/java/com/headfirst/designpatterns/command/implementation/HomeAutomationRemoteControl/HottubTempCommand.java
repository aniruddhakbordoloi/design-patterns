package com.headfirst.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class HottubTempCommand implements Command {

    private Hottub hottub;

    public HottubTempCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public String execute() {
        return hottub.temperature();
    }
}
