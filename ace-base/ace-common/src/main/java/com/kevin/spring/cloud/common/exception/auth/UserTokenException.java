package com.kevin.spring.cloud.common.exception.auth;

import com.kevin.spring.cloud.common.constant.CommonConstants;
import com.kevin.spring.cloud.common.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
