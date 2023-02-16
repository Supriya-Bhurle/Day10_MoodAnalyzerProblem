package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodTester {
    MoodAnalyser obj = new MoodAnalyser();
    MoodAnalyser a = new MoodAnalyser("I am in Happy mood");
    MoodAnalyser b = new MoodAnalyser("I am in Sad mood");
    MoodAnalyser c = new MoodAnalyser("I am in Any mood");

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

