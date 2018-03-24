package com.headfirst.designpatterns.command.implementation.HomeAutomationRemoteControl;

/**
 * Created by Aniruddha on 06-03-2018.
 */
public class StereoVolumeCommand implements Command {
    private Stereo stereo;

    public StereoVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    public String execute() {
        return stereo.setVolume();
    }
}
