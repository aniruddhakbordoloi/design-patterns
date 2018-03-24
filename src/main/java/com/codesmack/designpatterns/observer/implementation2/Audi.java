package com.codesmack.designpatterns.observer.implementation2;

/**
 * Created by Aniruddha on 26-01-2018.
 */
public class Audi extends Car {

    public void myName(){
        System.out.println("Mamu");
    }

    public void talkAboutMyCar() {
        int seats = 6;
        System.out.println(color);
        System.out.println(wheels);
        System.out.println(fuel);
        System.out.println(seats);
    }

    public static void tryRandom() {
        System.out.println();
    }
}
