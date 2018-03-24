package com.codesmack.designpatterns.strategy.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class WomanBehavior implements HumanBehavior {
    public void eat() {
        System.out.println("Woman's eating: softly!");
    }

    public void snore() {
        System.out.println("Woman's snore: That was silent but disruptive!!");
    }

    public void drive() {
        System.out.println("Women driving: Should we say more?");
    }
}
