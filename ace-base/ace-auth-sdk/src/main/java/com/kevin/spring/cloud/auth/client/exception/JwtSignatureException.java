package com.kevin.spring.cloud.auth.client.exception;

public class JwtSignatureException extends Exception {
    public JwtSignatureException(String s) {
        super(s);
    }
}
