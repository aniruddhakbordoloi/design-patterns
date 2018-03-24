package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class StereoDVDCommand implements Command {
    private Stereo stereo;

    public StereoDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public String execute() {
        return stereo.dvdMode();
    }
}
