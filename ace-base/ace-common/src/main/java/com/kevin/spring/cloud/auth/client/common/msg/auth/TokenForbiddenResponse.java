package com.kevin.spring.cloud.auth.client.common.msg.auth;

import com.kevin.spring.cloud.auth.client.common.constant.RestCodeConstants;
import com.kevin.spring.cloud.auth.client.common.msg.BaseResponse;

public class TokenForbiddenResponse extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
