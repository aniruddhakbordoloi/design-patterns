package com.headfirst.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class FanMediumCommand implements Command {

    private Fan fan;

    public FanMediumCommand(Fan fan) {
        this.fan = fan;
    }

    public String execute() {
        return fan.medium();
    }

    public String undo() {
        if(fan.getPreviousSpeed() == Fan.HIGH) {
            return fan.high();
        }
        else if (fan.getPreviousSpeed() == Fan.MED) {
            return fan.medium();
        }
        else if (fan.getPreviousSpeed() == Fan.OFF) {
            return fan.off();
        }
        else if (fan.getPreviousSpeed() == Fan.ON) {
            return fan.on();
        }
        return null;
    }
}
