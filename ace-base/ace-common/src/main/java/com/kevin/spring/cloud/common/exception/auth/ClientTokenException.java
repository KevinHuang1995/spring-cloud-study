package com.kevin.spring.cloud.common.exception.auth;

import com.kevin.spring.cloud.common.constant.CommonConstants;
import com.kevin.spring.cloud.common.exception.BaseException;

public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
