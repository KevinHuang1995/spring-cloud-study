package com.kevin.spring.cloud.auth.client.common.exception.auth;

import com.kevin.spring.cloud.auth.client.common.constant.CommonConstants;
import com.kevin.spring.cloud.auth.client.common.exception.BaseException;

public class ClientForbiddenException  extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
