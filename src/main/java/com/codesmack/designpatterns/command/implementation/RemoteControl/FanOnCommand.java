package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public String execute() {
        return fan.on();
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
