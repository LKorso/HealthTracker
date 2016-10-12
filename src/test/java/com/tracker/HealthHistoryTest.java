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
        assertEquals(6000, instance.countWalkintTimeDuringTerm(format.parse("06-10-2016"), format.parse("13-10-2050")));
    }
}
