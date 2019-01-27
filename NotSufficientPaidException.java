package com.company;

public class NotSufficientPaidException extends Exception {
    public NotSufficientPaidException(String message) {
        super(message) ;
    }
}
