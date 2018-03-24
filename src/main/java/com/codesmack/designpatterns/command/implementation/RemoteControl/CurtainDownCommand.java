package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class CurtainDownCommand implements Command {
    private Curtain curtain;

    public CurtainDownCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    public String execute() {
        return curtain.pullDown();
    }

    public String undo() {
        return curtain.pullUp();
    }
}
