package com.foodTrackerApp.exceptions;

public class SQLException extends RuntimeException{
    private final String message;

    public SQLException(String message) {
        this.message = message;
    }

    public SQLException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}