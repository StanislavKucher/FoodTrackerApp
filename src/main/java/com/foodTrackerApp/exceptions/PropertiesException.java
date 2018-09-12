package com.foodTrackerApp.exceptions;

public class PropertiesException extends RuntimeException {
    private final String message;

    public PropertiesException(String message) {
        this.message = message;
    }

    public PropertiesException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
