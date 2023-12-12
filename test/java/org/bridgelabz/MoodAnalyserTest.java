package org.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MoodAnalyserTest {

    private MoodAnalyser moodAnalyser;

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

    @Test(expected = MoodAnalysisException.class)
    public void testEmptyMessage() throws MoodAnalysisException {
        moodAnalyser.setMessage("");
        moodAnalyser.analyseMood();
    }

    @Test(expected = MoodAnalysisException.class)
    public void testUnknownMood() throws MoodAnalysisException {
        moodAnalyser.setMessage("I am feeling excited");
        moodAnalyser.analyseMood();
    }

    @Test
    public void testExceptionType() {
        moodAnalyser.setMessage(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.NULL_MOOD, e.getType());
        }
    }
}
