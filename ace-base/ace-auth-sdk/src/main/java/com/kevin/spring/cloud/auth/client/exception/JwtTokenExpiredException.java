package com.kevin.spring.cloud.auth.client.exception;

public class JwtTokenExpiredException extends Exception {
    public JwtTokenExpiredException(String s) {
        super(s);
    }
}
