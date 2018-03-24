package com.codesmack.designpatterns.strategy.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public abstract class Human {

    private HumanBehavior humanBehavior;

    public void setHumanBehavior(HumanBehavior humanBehavior) throws IndefiniteBehaviorException {
        if (null == humanBehavior) {
            throw new IndefiniteBehaviorException("Behavior could not be determined.");
        }
        this.humanBehavior = humanBehavior;
    }

    public void eat() throws IndefiniteBehaviorException {
        if (null == humanBehavior) {
            throw new IndefiniteBehaviorException("Behavior could not be determined.");
        }
        humanBehavior.eat();
    }

    public void fart() throws IndefiniteBehaviorException {
        if (null == humanBehavior) {
            throw new IndefiniteBehaviorException("Behavior could not be determined.");
        }
        humanBehavior.snore();
    }

    public void drive() throws IndefiniteBehaviorException {
        if (null == humanBehavior) {
            throw new IndefiniteBehaviorException("Behavior could not be determined.");
        }
        humanBehavior.drive();
    }

    public void swim() {
        System.out.println("Both men and women swim the same way!");
    }

    public abstract void jobName();
}
