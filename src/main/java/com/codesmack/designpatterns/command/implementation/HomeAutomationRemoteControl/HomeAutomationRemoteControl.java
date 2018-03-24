package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class HomeAutomationRemoteControl {

    public String executeCommand(MacroCommand relaxMacroCommand) {
        return relaxMacroCommand.execute();
    }
}
