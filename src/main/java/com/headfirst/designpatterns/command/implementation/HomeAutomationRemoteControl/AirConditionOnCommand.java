package com.headfirst.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class AirConditionOnCommand implements Command {
    private AirCondition airCondition;

    public AirConditionOnCommand(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public String execute() {
        return airCondition.on();
    }
}
