package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Happy") || message.contains("Any"))
            return "Happy";
        else
            return "Sad";
    }
    public String checkMood(String mood) {
        if (mood.equals("Happy"))
            return "Happy";
        else
            return "Sad";
    }
    public static String invalidMoodAnalyser(String message) throws MoodAnalyserException {
        if (message == null)
        {
            try
            {
                throw new MoodAnalyserException();
            }
            catch (MoodAnalyserException exception)
            {
                return "Happy";
            }
        }
        return "Sad";
    }}