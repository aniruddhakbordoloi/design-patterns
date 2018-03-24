package com.codesmack.designpatterns.command.implementation.RemoteControl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public class RemoteControlTest {

    @Test
    public void thatLivingRoomLightIsSwitchedOn() {
        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light("Living Room");
        final Command lightOnCommandForLivingRoom = new LightOnCommand(light);
        final String commandResponse = remoteControl.executeCommand(lightOnCommandForLivingRoom);
        assertEquals("Assertion Error: Living room light did not turn on.","Living Room light is switched on.", commandResponse);
    }
    @Test
    public void thatKitchenLightIsSwitchedOn() {
        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light("Kitchen");
        final LightOnCommand lightOnCommandForKitchen = new LightOnCommand(light);
        final String commandResponse = remoteControl.executeCommand(lightOnCommandForKitchen);
        assertEquals("Assertion Error: Kitchen light did not turn on.","Kitchen light is switched on.", commandResponse);
    }
    @Test
    public void thatCeilingFanForLivingRoomIsSwitchedOn() {
        final RemoteControl remoteControl = new RemoteControl();
        final Fan fan = new CeilingFan("Living Room");
        final Command fanOnCommandForLivingRoom = new FanOnCommand(fan);
        final String commandResponse = remoteControl.executeCommand(fanOnCommandForLivingRoom);
        assertEquals("Assertion Error: Living Room fan did not turn on.","Living Room fan is switched on.", commandResponse);
    }
    @Test
    public void thatCeilingFanForKitchenIsSwitchedOn() {
        final RemoteControl remoteControl = new RemoteControl();
        final Fan fan = new CeilingFan("Kitchen");
        final FanOnCommand fanOnCommandForKitchen = new FanOnCommand(fan);
        final String commandResponse = remoteControl.executeCommand(fanOnCommandForKitchen);
        assertEquals("Assertion Error: Kitchen fan did not turn on.","Kitchen fan is switched on.", commandResponse);
    }
    @Test
    public void thatCeilingFanForBedRoomIsSwitchedOn() {
        final RemoteControl remoteControl = new RemoteControl();
        final Fan fan = new CeilingFan("BedRoom");
        final FanOnCommand fanOnCommandForBedroom = new FanOnCommand(fan);
        final String commandResponse = remoteControl.executeCommand(fanOnCommandForBedroom);
        assertEquals("Assertion Error: BedRoom fan did not turn on.","BedRoom fan is switched on.", commandResponse);
    }
    @Test
    public void thatCurtainsForBedRoomArePulledDown() {
        final RemoteControl remoteControl = new RemoteControl();
        final Curtain curtain = new Curtain("BedRoom");
        final Command curtainDownCommandForBedRoom = new CurtainDownCommand(curtain);
        final String commandResponse = remoteControl.executeCommand(curtainDownCommandForBedRoom);
        assertEquals("Assertion Error: BedRoom curtains were not pulled down.","BedRoom curtains are pulled down.", commandResponse);
    }
    @Test
    public void thatCurtainsForLivingRoomArePulledDown() {
        final RemoteControl remoteControl = new RemoteControl();
        final Curtain curtain = new Curtain("Living Room");
        final Command curtainDownCommandForLivingRoom = new CurtainDownCommand(curtain);
        final String commandResponse = remoteControl.executeCommand(curtainDownCommandForLivingRoom);
        assertEquals("Assertion Error: Living Room curtains were not pulled down.","Living Room curtains are pulled down.", commandResponse);
    }
    @Test
    public void thatLivingRoomLightIsSwitchedOnAndUndone() {
        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light("Living Room");
        final Command lightOnCommandForLivingRoom = new LightOnCommand(light);
        final String commandResponse = remoteControl.executeCommand(lightOnCommandForLivingRoom);
        final String undoCommandResponse = remoteControl.undoCommand();
        assertEquals("Assertion Error: Living room light did not turn on.","Living Room light is switched on.", commandResponse);
        assertEquals("Assertion Error: Living room light did not turn off.","Living Room light is switched off.", undoCommandResponse);
    }
    @Test
    public void thatCeilingFanForLivingRoomIsSwitchedOnSetToHighThenMediumAndUndone() {
        final RemoteControl remoteControl = new RemoteControl();
        final Fan fan = new CeilingFan("Living Room");
        final Command fanOnCommand = new FanOnCommand(fan);
        final Command fanHighCommand = new FanHighCommand(fan);
        final Command fanMediumCommand = new FanMediumCommand(fan);
        final String commandResponseFanOn = remoteControl.executeCommand(fanOnCommand);
        final String commandResponseFanHigh = remoteControl.executeCommand(fanHighCommand);
        final String commandResponseFanMed = remoteControl.executeCommand(fanMediumCommand);
        final String commandResponseUndo = remoteControl.undoCommand();
        assertEquals("Assertion Error: Living Room fan did not turn on.","Living Room fan is switched on.", commandResponseFanOn);
        assertEquals("Assertion Error: Living Room fan could not be set to high.","Living Room fan is set to high.", commandResponseFanHigh);
        assertEquals("Assertion Error: Living Room fan could not be set to medium.","Living Room fan is set to medium.", commandResponseFanMed);
        assertEquals("Assertion Error: Undo command failed.","Living Room fan is set to high.", commandResponseUndo);
    }
    @Test
    public void thatCeilingFanForLivingRoomIsSwitchedOnSetToHighThenUndoneThenMediumAndUndone() {
        final RemoteControl remoteControl = new RemoteControl();
        final Fan fan = new CeilingFan("Living Room");
        final Command fanOnCommand = new FanOnCommand(fan);
        final Command fanHighCommand = new FanHighCommand(fan);
        final Command fanMediumCommand = new FanMediumCommand(fan);
        final String commandResponseFanOn = remoteControl.executeCommand(fanOnCommand);
        final String commandResponseFanHigh = remoteControl.executeCommand(fanHighCommand);
        final String commandResponseUndoToOn = remoteControl.undoCommand();
        final String commandResponseFanMed = remoteControl.executeCommand(fanMediumCommand);
        final String commandResponseUndo = remoteControl.undoCommand();
        assertEquals("Assertion Error: Living Room fan did not turn on.","Living Room fan is switched on.", commandResponseFanOn);
        assertEquals("Assertion Error: Living Room fan could not be set to high.","Living Room fan is set to high.", commandResponseFanHigh);
        assertEquals("Assertion Error: Undo command failed_1.","Living Room fan is switched on.", commandResponseUndoToOn);
        assertEquals("Assertion Error: Living Room fan could not be set to medium.","Living Room fan is set to medium.", commandResponseFanMed);
        assertEquals("Assertion Error: Undo command failed_2.","Living Room fan is switched on.", commandResponseUndo);
    }
    /*@Test
    public void thatLightsFansAndCurtainsCanBeOperatedTogether() {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final Command lightOnCommandForLivingRoom = new LightOnCommand(livingRoomLight);

        final Light kitchenLight = new Light("Kitchen");
        final LightOnCommand lightOnCommandForKitchen = new LightOnCommand(kitchenLight);

        final Fan livingRoomFan = new CeilingFan("Living Room");
        final Command fanOnCommandForLivingRoom = new FanOnCommand(livingRoomFan);

        final Fan kitchenFan = new CeilingFan("Kitchen");
        final FanOnCommand fanOnCommandForKitchen = new FanOnCommand(kitchenFan);

        final Fan bedRoomFan = new CeilingFan("BedRoom");
        final FanOnCommand fanOnCommandForBedroom = new FanOnCommand(bedRoomFan);

        final Curtain bedroomCurtains = new Curtain("BedRoom");
        final Command curtainDownCommandForBedRoom = new CurtainDownCommand(bedroomCurtains);

        final Curtain livingRoomCurtains = new Curtain("Living Room");
        final Command curtainDownCommandForLivingRoom = new CurtainDownCommand(livingRoomCurtains);


    }*/
}
