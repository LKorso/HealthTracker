package com.tracker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrackerTest {
    private static HealthTracker instance;

    @Before
    public void setUpTest() throws Exception {
        instance = new HealthTracker();
    }

    @Test
    public void eatTest() throws Exception {
        instance.eat(1330);
        assertEquals(670, instance.leftToEat());
    }

    @Test
    public void drinkTest() throws Exception {
        instance.drink(1500);
        assertEquals(500, instance.leftToDrink());
    }

    @Test
    public void stepsTest() throws Exception {
        instance.walkInSteps(200);
        assertEquals(1800, instance.leftToWalkSteps());
    }

    
}
