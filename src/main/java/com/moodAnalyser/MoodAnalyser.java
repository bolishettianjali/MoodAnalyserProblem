package com.moodAnalyser;

import com.Exception.MoodAnalyserException;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() { }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * This method takes message as parameters and returns SAD if the message contains sad else HAPPY
     * @param message
     * @return
     */
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }

    /**
     * This method returns SAD if the message contains sad else HAPPY
     * @return
     */
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (this.message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Empty Mood");
        }
    }
}
