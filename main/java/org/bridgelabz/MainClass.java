package org.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        // Test Case: Happy mood
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am feeling happy today");
        invokeMoodAnalyser(moodAnalyser1);

        // Test Case: Sad mood
        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am feeling sad today");
        invokeMoodAnalyser(moodAnalyser2);

        // Test Case: Null message (Should throw an exception)
        MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
        invokeMoodAnalyser(moodAnalyser3);
    }

    /*
     * @desc:method to analyse and print mood
     * @params:Mood Analyser object
     * @return:none
     */
    private static void invokeMoodAnalyser(MoodAnalyser moodAnalyser) {
        try {
            String mood = moodAnalyser.analyseMood();
            System.out.println("Mood: " + mood);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}