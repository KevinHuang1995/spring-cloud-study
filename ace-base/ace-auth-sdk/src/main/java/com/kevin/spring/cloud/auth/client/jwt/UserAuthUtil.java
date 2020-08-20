package com.kevin.spring.cloud.auth.client.jwt;

import com.kevin.spring.cloud.auth.client.common.exception.auth.UserTokenException;
import com.kevin.spring.cloud.auth.client.common.util.jwt.IJWTInfo;
import com.kevin.spring.cloud.auth.client.common.util.jwt.JWTHelper;
import com.kevin.spring.cloud.auth.client.config.UserAuthConfig;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserAuthUtil {
    @Autowired
    private UserAuthConfig userAuthConfig;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        try {
            return JWTHelper.getInfoFromToken(token, userAuthConfig.getPubKeyByte());
        } catch (ExpiredJwtException ex) {
            throw new UserTokenException("User token expired!");
        } catch (SignatureException ex) {
            throw new UserTokenException("User token signature error!");
        } catch (IllegalArgumentException ex) {
            throw new UserTokenException("User token is null or empty!");
        }
    }
}
