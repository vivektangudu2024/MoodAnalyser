package org.bridgelabz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    public static void main(String[] args) throws MoodAnalysisException {

        @Test
        public void testHappyMood()  {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am feeling happy today");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Happy", mood);
        }

        @Test
        public void testSadMood() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am feeling sad today");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Sad", mood);
        }

        @Test
        public void testNullMessage() {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        }

        @Test
        public void testEmptyMessage()  {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Happy", mood);  // Assuming empty string defaults to "Happy"
        }
    }
}