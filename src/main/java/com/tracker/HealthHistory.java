package com.tracker;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HealthHistory {
    private Map<Date, Integer> caloriesHistory = new HashMap<Date, Integer>();
    private Map<Date, Integer> stepsHistory = new HashMap<Date, Integer>();
    private Map<Date, Integer> waterVolumeHistory = new HashMap<Date, Integer>();
    private Map<Date, Integer> walkingInMinutesHistory = new HashMap<Date, Integer>();

    public void setDailyCaloriesHistory(int calories, Date date){
        caloriesHistory.put(date, calories);
    }

    public void setDailyStepsHistory(int steps, Date date){
        stepsHistory.put(date, steps);
    }

    public void setDailyWaterVolumeHistory(int waterVolume, Date date){
        waterVolumeHistory.put(date, waterVolume);
    }

    public void setDailyMinutesHistory(int minutes, Date date){
        walkingInMinutesHistory.put(date, minutes);
    }

    public int countCaloriesDuringTerm(Date startDate, Date endDate){
        return countValuesDuringTerm(startDate, endDate, caloriesHistory);
    }

    public int countStepsDuringTerm(Date startDate, Date endDate){
        return countValuesDuringTerm(startDate, endDate, stepsHistory);
    }

    public int countWaterVolumeDuringTerm(Date startDate, Date endDate){
        return countValuesDuringTerm(startDate, endDate, waterVolumeHistory);
    }

    public int countWalkintTimeDuringTerm(Date startDate, Date endDate){
        return countValuesDuringTerm(startDate, endDate, walkingInMinutesHistory);
    }

    private int countValuesDuringTerm(Date startDate, Date endDate, Map<Date, Integer> values){
        int calories = 0;
        for(Date date : values.keySet()){
            if(date.after(startDate) && date.before(endDate)){
                calories += values.get(date);
            }
        }
        return calories;
    }
}
