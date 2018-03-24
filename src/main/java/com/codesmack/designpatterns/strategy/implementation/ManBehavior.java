package com.codesmack.designpatterns.strategy.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class ManBehavior implements HumanBehavior {
    public void eat() {
        System.out.println("Man's eating: too harsh");
    }

    public void snore() {
        System.out.println("Man's snore is a big one!");
    }

    public void drive() {
        System.out.println("Men drive logical");
    }
}
