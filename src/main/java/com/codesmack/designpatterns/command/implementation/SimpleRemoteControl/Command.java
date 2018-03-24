package com.codesmack.designpatterns.command.implementation.SimpleRemoteControl;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public interface Command {
    String execute() throws CommandException;
}
