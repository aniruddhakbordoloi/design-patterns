package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public interface Command {
    String execute();

    String undo();
}
