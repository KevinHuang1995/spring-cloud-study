package com.kevin.spring.cloud.auth.client.common.exception.auth;

import com.kevin.spring.cloud.auth.client.common.constant.CommonConstants;
import com.kevin.spring.cloud.auth.client.common.exception.BaseException;

public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
