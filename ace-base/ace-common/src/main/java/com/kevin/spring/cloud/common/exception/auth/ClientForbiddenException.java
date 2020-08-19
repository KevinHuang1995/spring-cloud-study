package com.kevin.spring.cloud.common.exception.auth;

import com.kevin.spring.cloud.common.constant.CommonConstants;
import com.kevin.spring.cloud.common.exception.BaseException;

public class ClientForbiddenException  extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
