package com.codesmack.designpatterns.command.implementation.RemoteControl;

/**
 * Created by Aniruddha on 04-03-2018.
 */
public interface Fan {

    int OFF = 0;
    int ON = 1;
    int MED = 3;
    int HIGH = 4;
    int LOW = 2;

    String on();

    String off();

    String high();

    String medium();

    int getPreviousSpeed();
}
