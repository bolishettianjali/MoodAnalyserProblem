package com.moodAnalyser;

public class MoodAnalyser {

    /**
     * This method returns SAD if the message contains sad else HAPPY
     * @param message
     * @return
     */
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
}
