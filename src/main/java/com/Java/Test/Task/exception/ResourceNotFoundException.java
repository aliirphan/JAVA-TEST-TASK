package com.Java.Test.Task.exception;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
    super(message);
    }
}
