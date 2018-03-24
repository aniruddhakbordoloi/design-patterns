package com.codesmack.designpatterns.command.implementation.HomeAutomationRemoteControl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 01-03-2018.
 */
public class HomeAutomationRemoteControlTest {

    @Test
    public void thatRelaxButtonSuccessfullyExecutedWhenPressed() {
        final HomeAutomationRemoteControl remoteControl = new HomeAutomationRemoteControl();

        final Light light = new Light();
        final LightOnCommand lightOnCommand = new LightOnCommand(light);
        final LightDimCommand lightDimCommand = new LightDimCommand(light);

        final Stereo stereo = new Stereo();
        final StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        final StereoDVDCommand stereoDVDCommand = new StereoDVDCommand(stereo);
        final StereoVolumeCommand stereoVolumeCommand = new StereoVolumeCommand(stereo);

        final Hottub hottub = new Hottub();
        final HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        final HottubTempCommand hottubTempCommand = new HottubTempCommand(hottub);
        final HottubWaterLevelCommand hottubWaterLevelCommand = new HottubWaterLevelCommand(hottub);

        final AirCondition airCondition = new AirCondition();
        final AirConditionOnCommand airConditionOnCommand = new AirConditionOnCommand(airCondition);
        final AirConditionTemperatureControlCommand airConditionTemperatureControlCommand = new AirConditionTemperatureControlCommand(airCondition);

        final Command [] relaxCommands = {lightOnCommand, lightDimCommand, stereoOnCommand, stereoDVDCommand, stereoVolumeCommand,
        hottubOnCommand, hottubTempCommand, hottubWaterLevelCommand, airConditionOnCommand, airConditionTemperatureControlCommand};

        final MacroCommand macroCommand = new MacroCommand(relaxCommands);
        final String commandResponse = remoteControl.executeCommand(macroCommand);
        final String [] individualCommandResponse = commandResponse.split(", ");

        assertEquals("Lights are switched on.",individualCommandResponse[0]);
        assertEquals("Lights are set to dim.",individualCommandResponse[1]);
        assertEquals("The stereo is turned ON.",individualCommandResponse[2]);
        assertEquals("The stereo is now set to DVD mode.",individualCommandResponse[3]);
        assertEquals("The volume is set to 12.",individualCommandResponse[4]);
        assertEquals("Hottub is turned on.",individualCommandResponse[5]);
        assertEquals("The temperature is set to 22.",individualCommandResponse[6]);
        assertEquals("The water level is set to 20 litres.",individualCommandResponse[7]);
        assertEquals("The air condition is turned on.",individualCommandResponse[8]);
        assertEquals("The AC has been set to the desired temperature.",individualCommandResponse[9]);
    }
}
