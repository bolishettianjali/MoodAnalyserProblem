package com.moodAnalyserTest;

import com.moodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser mood;

    @BeforeEach
    public void objectMethod() {
        mood = new MoodAnalyser();
    }

    @Test
    public void testAnalyseMood() {
        String result = mood.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", result);
    }
}
