package com.kevin.spring.cloud.common.msg.auth;

import com.kevin.spring.cloud.common.constant.RestCodeConstants;
import com.kevin.spring.cloud.common.msg.BaseResponse;

public class TokenErrorResponse extends BaseResponse {

    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
