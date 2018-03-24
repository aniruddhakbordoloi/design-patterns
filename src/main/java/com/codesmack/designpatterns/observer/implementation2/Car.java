package com.codesmack.designpatterns.observer.implementation2;

/**
 * Created by Aniruddha on 26-01-2018.
 */
public class Car {
    public String color = "blue";
    public String fuel = "petrol";
    public int wheels = 4;
    public int steering = 1;

    public void talkAboutMyCar(){
        System.out.println(1/0);
        int seats = 4;
        System.out.println("Color of car = "+color);
        System.out.println(("Seats of car = "+seats));
    }

    //public abstract void talkAboutMyCar();

}
