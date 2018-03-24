package com.codesmack.designpatterns.strategy.implementation;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

/**
 * Created by Aniruddha on 19-11-2017.
 */
@FixMethodOrder(MethodSorters.JVM)
public class HumanTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void thatMenBehaviorsAreDemonstrated() throws IndefiniteBehaviorException {
        final Human man = new Man();
        man.setHumanBehavior(new ManBehavior());
        man.jobName();
        man.eat();
        man.fart();
        man.drive();
        man.swim();
    }

    @Test
    public void thatWomenBehaviorsAreDemonstrated() throws IndefiniteBehaviorException {
        final Human woman = new Woman();
        woman.setHumanBehavior(new WomanBehavior());
        woman.jobName();
        woman.eat();
        woman.fart();
        woman.drive();
        woman.swim();
    }

    @Test
    public void thatIncorrectBehaviorIsNotAllowed() throws IndefiniteBehaviorException {
        expectedException.expect(IndefiniteBehaviorException.class);
        expectedException.expectMessage("Behavior could not be determined.");
        final Human human = new Man();
        human.setHumanBehavior(null);
    }
}
