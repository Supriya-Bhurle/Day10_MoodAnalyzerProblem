package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyser {
    MoodAnalyzer obj = new MoodAnalyzer();
    MoodAnalyzer a = new MoodAnalyzer("I am in Happy mood");
    MoodAnalyzer b = new MoodAnalyzer("I am in Sad mood");
    MoodAnalyzer c = new MoodAnalyzer("I am in Any mood");

    @Test
    public void testMood() {
        assertEquals("Happy" , a.analyseMood());
        assertEquals("Sad" , b.analyseMood());
        assertEquals("Happy" , c.analyseMood());
    }

    @Test
    public void testAnotherMood() {
        assertEquals("Sad" , obj.checkMood("Sad"));
        assertEquals("Happy" , obj.checkMood("Happy"));
    }
    }

