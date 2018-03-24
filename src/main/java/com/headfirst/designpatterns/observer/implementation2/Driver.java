package com.headfirst.designpatterns.observer.implementation2;

/**
 * Created by Aniruddha on 26-01-2018.
 */
public class Driver {
    public static void main(String[] args) {
        Car audi = new Audi();
        audi.talkAboutMyCar();

        Car car = new Car();
        car.talkAboutMyCar();
       // car.printData();
        /*Audi audi = new Audi();
        audi.myName();
        audi.talkAboutMyCar();*/
    }
}
