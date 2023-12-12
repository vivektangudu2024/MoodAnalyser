package org.bridgelabz;

class MoodAnalysisException extends Exception {

    // Enum to represent mood analysis errors
    enum ExceptionType {
        NULL_MOOD, EMPTY_MOOD, INVALID_MOOD
    }

    private final ExceptionType type;

    //@desc: Constructor with the exception type
    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    //@desc: Getter for the exception type
    public ExceptionType getType() {
        return type;
    }
}