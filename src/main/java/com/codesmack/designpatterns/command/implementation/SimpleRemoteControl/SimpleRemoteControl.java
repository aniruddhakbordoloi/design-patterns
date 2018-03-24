package com.codesmack.designpatterns.command.implementation.SimpleRemoteControl;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public class SimpleRemoteControl {

    public String giveCommand(Command command) throws CommandException {
        return command.execute();
    }
}
