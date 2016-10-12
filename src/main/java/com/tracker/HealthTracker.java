package com.tracker;

public class HealthTracker {
    private int defaultCaloriesNorm;
    private int defaultWaterNorm;
    private int defaultWalkingTimeNorm;
    private int defaultStepsNorm;
    private int calories;
    private int waterVolume;
    private int walkingTime;
    private int steps;

    public HealthTracker(){
        defaultCaloriesNorm = 2000;
        defaultWaterNorm = 2000;
        defaultWalkingTimeNorm = 2000;
        defaultStepsNorm = 2000;
    }

    public int leftToEat(){
        return defaultCaloriesNorm - calories;
    }

    public int leftToDrink(){
        return defaultWaterNorm - waterVolume;
    }

    public int leftToWalkTime(){
        return defaultWalkingTimeNorm - walkingTime;
    }

    public int leftToWalkSteps(){
        return defaultStepsNorm - steps;
    }

    public void eat(int givenCalories){
        calories += givenCalories;
    }

    public void drink(int givenVolume) {
        waterVolume += givenVolume;
    }

    public void walkInSteps(int givenSteps) {
        steps += givenSteps;
    }

    public void walkInTime(int givenMinutes) {
        walkingTime += givenMinutes;
    }

    public void changeDailyCalorieNorm(int newCalorieNorm) {
        defaultCaloriesNorm = newCalorieNorm;
    }

    public void changeDailyWaterNorm(int newWaterNorm) {
        defaultWaterNorm = newWaterNorm;
    }

    public void changeDailyStepsNorm(int newStepsNorm) {
        defaultStepsNorm = newStepsNorm;
    }

    public void changeDailyMinutesNorm(int newMinutesNorm) {
        defaultWalkingTimeNorm = newMinutesNorm;
    }
}
