package com.moodAnalyserTest;

import com.moodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testAnalyseMoodForSad() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void testAnalyseMoodForAnyMood() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    public void testAnalyseMoodForSadUsingParamConst() {
        MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
        String result = mood.analyseMood();
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void testAnalyseMoodForAnyMoodUsingParamConst() {
        MoodAnalyser mood = new MoodAnalyser("I am in any mood");
        String result = mood.analyseMood();
        Assertions.assertEquals("HAPPY", result);
    }
}
