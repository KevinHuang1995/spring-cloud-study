package com.kevin.spring.cloud.auth.client.common.exception.auth;

import com.kevin.spring.cloud.auth.client.common.constant.CommonConstants;
import com.kevin.spring.cloud.auth.client.common.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
