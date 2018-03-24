package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 07-03-2018.
 */
public class AirConditionTemperatureControlCommand implements Command {

    private AirCondition airCondition;
    public AirConditionTemperatureControlCommand(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public String execute() {
        return airCondition.setTemperature();
    }
}
