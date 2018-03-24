package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class RemoteControl {

    private Command command;

    public String executeCommand(final Command command) {
        this.command = command;
        return command.execute();
    }

    public String undoCommand() {
        return command.undo();
    }
}
