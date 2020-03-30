package com.FeedMe.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){super("No resource(s) found");}
}
