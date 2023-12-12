package org.bridgelabz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    public static void main(String[] args) throws MoodAnalysisException {

        MoodAnalyser moodAnalyser;

        @Before
        public void setUp() {
            moodAnalyser = new MoodAnalyser();
        }

        @Test
        public void testHappyMood() throws MoodAnalysisException {
            moodAnalyser.setMessage("I am feeling happy today");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Happy", mood);
        }

        @Test
        public void testSadMood() throws MoodAnalysisException {
            moodAnalyser.setMessage("I am feeling sad today");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Sad", mood);
        }

        @Test(expected = MoodAnalysisException.class)
        public void testNullMessage() throws MoodAnalysisException {
            moodAnalyser.setMessage(null);
            moodAnalyser.analyseMood();
        }

        @Test
        public void testEmptyMessage() throws MoodAnalysisException {
            moodAnalyser.setMessage("");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Unable to determine mood", mood);
        }

        @Test
        public void testUnknownMood() throws MoodAnalysisException {
            moodAnalyser.setMessage("I am feeling excited");
            String mood = moodAnalyser.analyseMood();
            assertEquals("Unable to determine mood", mood);
        }
    }
}