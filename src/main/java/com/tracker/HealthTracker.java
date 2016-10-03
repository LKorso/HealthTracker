package com.tracker;

public class HealthTracker {
    private static final int DEFAULT_CALORIES = 2000;
    private static final int DEFAULT_WATER_VOLUME = 2000;
    private static final int DEFAULT_WALKING_TIME = 2000;
    private static final int DEFAULT_STEPS = 2000;
    private int calories;
    private int waterVolume;
    private int walkingTime;
    private int steps;

    public HealthTracker(){
        calories = DEFAULT_CALORIES;
        waterVolume = DEFAULT_WATER_VOLUME;
        walkingTime = DEFAULT_WALKING_TIME;
        steps = DEFAULT_STEPS;
    }

    public int leftToEat(){
        return calories;
    }

    public int leftToDrink(){
        return waterVolume;
    }

    public int leftToWalkTime(){
        return walkingTime;
    }

    public int leftToWalkSteps(){
        return steps;
    }

    public void eat(int givenCalories){
        calories -= givenCalories;
    }

    public void drink(int givenVolume) {
        waterVolume -= givenVolume;
    }

    public void walkInSteps(int givenSteps) {
        steps -= givenSteps;
    }

    public void walkInTime(int givenMinutes) {
        walkingTime -= givenMinutes;
    }
}
