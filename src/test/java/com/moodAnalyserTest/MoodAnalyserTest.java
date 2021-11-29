package com.moodAnalyserTest;

import com.moodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.BeforeEach;

public class MoodAnalyserTest {

    MoodAnalyser mood;

    @BeforeEach
    public void objectMethod(){
        mood = new MoodAnalyser();
    }

    public void testAnalyseMood() {
        mood.analyseMood("");
    }
}
