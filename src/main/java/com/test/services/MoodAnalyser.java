package com.test.services;

public class MoodAnalyser {
    public String analyseMood(String message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }



    String message;


    public MoodAnalyser() {
        this.message = "";
    }


    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood() throws MoodAnalyserException {

        try {
            if(message == null){
                return "HAPPY";
            }

            if(message.length()==0){
                throw new MoodAnalyserException(MoodErrorType.EMPTY,"mood is empty");
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalyserException e) {
         throw e;
        }


    }

}
