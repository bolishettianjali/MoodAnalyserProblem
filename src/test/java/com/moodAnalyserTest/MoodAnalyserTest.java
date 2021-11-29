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
    public void testAnalyseMoodForSad() {
        String result = mood.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void testAnalyseMoodForAnyMood() {
        String result = mood.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", result);
    }
}
