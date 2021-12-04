package com.Exception;

public class MoodAnalyserException extends Exception{

    public enum ExceptionType{
        NULL, EMPTY
    }

    public MoodAnalyserException(String message) {
        super(message);
    }
}
