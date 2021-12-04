package com.moodAnalyserTest;

import com.Exception.MoodAnalyserException;
import com.moodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testAnalyseMoodForSadUsingParamConst() throws MoodAnalyserException {

        MoodAnalyser mood = new MoodAnalyser("");
        try {
            mood.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals("EMPTY MOOD", e.getMessage());
        }
    }
}
