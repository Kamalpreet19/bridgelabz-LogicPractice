package com.test.services;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @Test
    public void testSadMoodUsingParameter() {
        MoodAnalyser m = new MoodAnalyser();
        String result = m.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void testAnyMoodUsingParameter() {
        MoodAnalyser m = new MoodAnalyser();
        String result = m.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", result);
    }


    @Test
    public void testSadMoodUsingConstructor() throws MoodAnalyserException {
        MoodAnalyser m = new MoodAnalyser("I am in Sad Mood");
        String result = m.analyseMood();
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void testAnyMoodUsingConstructor() throws MoodAnalyserException {
        MoodAnalyser m= new MoodAnalyser("I am in Any Mood");
        String result = m.analyseMood();
        Assert.assertEquals("HAPPY", result);
    }


    @Test
    public void testNullMood() throws MoodAnalyserException {
        MoodAnalyser m=new MoodAnalyser(null);
        String result=m.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }


    @Test
    public void testNullMoodException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodErrorType.NULL, e.type);
        }
    }

    @Test
    public void testEmptyMoodException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodErrorType.EMPTY, e.type);
        }

    }
}


