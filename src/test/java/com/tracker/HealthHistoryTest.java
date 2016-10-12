package com.tracker;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthHistoryTest {
    private HealthHistory instance;
    private SimpleDateFormat format;

    @Before
    public void setUp() throws Exception {
        instance = new HealthHistory();
        format = new SimpleDateFormat("dd-MM-yyyy");
    }

    @Test
    public void countStepsPerTermTest() throws Exception {
        instance.setDailyStepsHistory(2000, new Date());
        instance.setDailyStepsHistory(2000, format.parse("09-10-2016"));
        instance.setDailyStepsHistory(2000, format.parse("07-10-2016"));
        instance.setDailyStepsHistory(2000, format.parse("07-09-2016"));
        assertEquals(6000, instance.countStepsDuringTerm(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countWaterPerTermTest() throws Exception {
        instance.setDailyWaterVolumeHistory(2000, new Date());
        instance.setDailyWaterVolumeHistory(2000, format.parse("09-10-2016"));
        instance.setDailyWaterVolumeHistory(2000, format.parse("07-10-2016"));
        instance.setDailyWaterVolumeHistory(2000, format.parse("07-09-2016"));
        assertEquals(6000, instance.countWaterVolumeDuringTerm(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countCaloriesPerTermTest() throws Exception {
        instance.setDailyCaloriesHistory(2000, new Date());
        instance.setDailyCaloriesHistory(2000, format.parse("09-10-2016"));
        instance.setDailyCaloriesHistory(2000, format.parse("07-10-2016"));
        instance.setDailyCaloriesHistory(2000, format.parse("07-09-2016"));
        assertEquals(6000, instance.countCaloriesDuringTerm(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countWalkInMinutesTermTest() throws Exception {
        instance.setDailyMinutesHistory(2000, new Date());
        instance.setDailyMinutesHistory(2000, format.parse("09-10-2016"));
        instance.setDailyMinutesHistory(2000, format.parse("07-10-2016"));
        instance.setDailyMinutesHistory(2000, format.parse("07-09-2016"));
        assertEquals(6000, instance.countWalkingTimeDuringTerm(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countStepsMedianTest() throws Exception {
        instance.setDailyStepsHistory(300, new Date());
        instance.setDailyStepsHistory(200, format.parse("09-10-2016"));
        instance.setDailyStepsHistory(400, format.parse("07-10-2016"));
        assertEquals(300, instance.countStepsMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
        instance.setDailyStepsHistory(200, format.parse("08-10-2016"));
        assertEquals(250, instance.countStepsMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countCaloriesMedianTest() throws Exception {
        instance.setDailyCaloriesHistory(300, new Date());
        instance.setDailyCaloriesHistory(200, format.parse("09-10-2016"));
        instance.setDailyCaloriesHistory(400, format.parse("07-10-2016"));
        assertEquals(300, instance.countCaloriesMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
        instance.setDailyCaloriesHistory(200, format.parse("08-10-2016"));
        assertEquals(250, instance.countCaloriesMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countWaterVolumeTest() throws Exception {
        instance.setDailyWaterVolumeHistory(300, new Date());
        instance.setDailyWaterVolumeHistory(200, format.parse("09-10-2016"));
        instance.setDailyWaterVolumeHistory(400, format.parse("07-10-2016"));
        assertEquals(300, instance.countWaterVolumeMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
        instance.setDailyWaterVolumeHistory(200, format.parse("08-10-2016"));
        assertEquals(250, instance.countWaterVolumeMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }

    @Test
    public void countWalkingTimeMedianTest() throws Exception {
        instance.setDailyMinutesHistory(300, new Date());
        instance.setDailyMinutesHistory(200, format.parse("09-10-2016"));
        instance.setDailyMinutesHistory(400, format.parse("07-10-2016"));
        assertEquals(300, instance.countWalkingTimeMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
        instance.setDailyMinutesHistory(200, format.parse("08-10-2016"));
        assertEquals(250, instance.countWalkingTimeMedian(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }
}
