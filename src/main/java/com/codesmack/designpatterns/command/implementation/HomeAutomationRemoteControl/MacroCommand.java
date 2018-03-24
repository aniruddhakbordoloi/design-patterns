package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 07-03-2018.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public String execute() {
        final String [] commandExecutionResponse = new String[commands.length];
        int count = 0;
        for(final Command command : commands) {
            commandExecutionResponse[count] = command.execute();
            count++;
        }
        return String.join(", ", commandExecutionResponse);
    }
}
