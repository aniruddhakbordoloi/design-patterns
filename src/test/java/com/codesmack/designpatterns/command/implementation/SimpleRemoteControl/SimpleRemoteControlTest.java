package com.codesmack.designpatterns.command.implementation.SimpleRemoteControl;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 24-02-2018.
 */
public class SimpleRemoteControlTest {

    SimpleRemoteControl simpleRemoteControl;
    Light light;

    @After
    public void destroyPostPerTestCase() {
        simpleRemoteControl = null;
        light = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void thatTheRemoteControlTurnsTheLightOn() throws CommandException {
        createSimpleRemoteControl();
        createLight();
        final String responseFromCommand = giveCommandToSwitchLightOn();
        assertEquals("Assertion Error: Light did not switch ON.","Light is switched ON..",responseFromCommand);
    }

    @Test
    public void thatTheRemoteControlTurnsTheLightOff() throws CommandException {
        createSimpleRemoteControl();
        createLight();
        giveCommandToSwitchLightOn();
        final String responseFromCommand = giveCommandToSwitchLightOff();
        assertEquals("Assertion Error: Light did not switch OFF.","Light is switched OFF..",responseFromCommand);
    }

    @Test
    public void thatOffCommandNotAllowedWithoutOn() throws CommandException {
        expectedException.expect(CommandException.class);
        expectedException.expectMessage("Light is already turned OFF.");
        createSimpleRemoteControl();
        createLight();
        giveCommandToSwitchLightOff();
    }

    @Test
    public void thatOnCommandNotAllowedWhenAlreadyOn() throws CommandException {
        expectedException.expect(CommandException.class);
        expectedException.expectMessage("Light is already turned ON.");
        createSimpleRemoteControl();
        createLight();
        giveCommandToSwitchLightOn();
        giveCommandToSwitchLightOn();
    }

    private String giveCommandToSwitchLightOff() throws CommandException {
        final Command lightOffCommand = new LightOffCommand(light);
        return simpleRemoteControl.giveCommand(lightOffCommand);
    }

    private void createLight() {
        light = new Light();
    }

    private void createSimpleRemoteControl() {
        simpleRemoteControl = new SimpleRemoteControl();
    }

    private String giveCommandToSwitchLightOn() throws CommandException {
        final Command command = new LightOnCommand(light);
        return simpleRemoteControl.giveCommand(command);
    }
}
