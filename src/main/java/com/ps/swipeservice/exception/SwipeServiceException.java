package com.ps.swipeservice.exception;

public class SwipeServiceException extends Exception {
    public SwipeServiceException() {super("Swipe Service Exception");}
    public SwipeServiceException(String message) {super(message);}
    public SwipeServiceException(String message, Throwable cause) {super(message, cause);}
}
