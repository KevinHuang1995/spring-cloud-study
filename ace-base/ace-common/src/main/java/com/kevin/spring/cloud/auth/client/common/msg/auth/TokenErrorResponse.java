package com.kevin.spring.cloud.auth.client.common.msg.auth;

import com.kevin.spring.cloud.auth.client.common.constant.RestCodeConstants;
import com.kevin.spring.cloud.auth.client.common.msg.BaseResponse;

public class TokenErrorResponse extends BaseResponse {

    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
