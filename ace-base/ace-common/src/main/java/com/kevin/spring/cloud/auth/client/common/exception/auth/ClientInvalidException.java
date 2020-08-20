package com.kevin.spring.cloud.auth.client.common.exception.auth;

import com.kevin.spring.cloud.auth.client.common.constant.CommonConstants;
import com.kevin.spring.cloud.auth.client.common.exception.BaseException;

public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
