package com.tracker;

import java.util.*;

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

    public int countWalkingTimeDuringTerm(Date startDate, Date endDate){
        return countValuesDuringTerm(startDate, endDate, walkingInMinutesHistory);
    }

    public int countStepsMedian(Date startDate, Date endDate){
        return countMedian(startDate, endDate, stepsHistory);
    }

    public int countCaloriesMedian(Date startDate, Date endDate) {
        return countMedian(startDate, endDate, caloriesHistory);
    }

    public int countWaterVolumeMedian(Date startDate, Date endDate){
        return countMedian(startDate, endDate, waterVolumeHistory);
    }

    public int countWalkingTimeMedian(Date startDate, Date endDate){
        return countMedian(startDate, endDate, walkingInMinutesHistory);
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

    private int countMedian(Date startDate, Date endDate, Map<Date, Integer> values){
        List<Integer> valuesPerTime = new ArrayList<Integer>();
        for (Date date : values.keySet()) {
            if(date.after(startDate) && date.before(endDate)){
                valuesPerTime.add(values.get(date));
            }
        }
        Collections.sort(valuesPerTime);
        if (valuesPerTime.size() % 2 == 0){
            return (valuesPerTime.get(valuesPerTime.size() / 2) + valuesPerTime.get(valuesPerTime.size() / 2 - 1)) / 2;
        }
        return valuesPerTime.get(valuesPerTime.size() / 2);
    }
}
