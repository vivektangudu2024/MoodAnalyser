package org.bridgelabz;

// @desc: class analysing the mood
public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    //@desc: Setter for message
    public void setMessage(String message) {
        this.message = message;
    }
    /*
    * desc: method to analyse mood or return exception
    * params: none
    * return: none
    * */
    public String analyseMood() throws MoodAnalysisException {
        if (message == null) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD, "Message cannot be null");
        }

        if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD, "Message cannot be empty");
        }
        if (message.contains("happy")) {
            return "Happy";
        } else if (message.contains("sad")) {
            return "Sad";
        } else {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.INVALID_MOOD, "Invalid mood provided");
        }
    }
}
