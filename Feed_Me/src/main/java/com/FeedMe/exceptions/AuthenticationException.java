package com.FeedMe.exceptions;

public class AuthenticationException extends RuntimeException{
    public AuthenticationException(){super("Authentication failed!");}
}
