package com.foodTrackerApp.exceptions;

public class ConnectionException extends RuntimeException {
    private final String message;

    public ConnectionException(String message) {
        this.message = message;
    }

    public ConnectionException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
