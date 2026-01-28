package com.test.services;

public class MoodAnalyserException extends Exception{

    public MoodErrorType type;

    MoodAnalyserException(MoodErrorType type, String message){
        super(message);
        this.type=type;

    }
}
