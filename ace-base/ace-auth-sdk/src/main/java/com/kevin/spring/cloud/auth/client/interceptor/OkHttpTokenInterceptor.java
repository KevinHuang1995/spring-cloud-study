package com.kevin.spring.cloud.auth.client.interceptor;

import com.kevin.spring.cloud.auth.client.common.context.BaseContextHandler;
import com.kevin.spring.cloud.auth.client.config.UserAuthConfig;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class OkHttpTokenInterceptor implements Interceptor {

    @Autowired
    private UserAuthConfig userAuthConfig;


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request newRequest = chain.request()
                .newBuilder()
                .header(userAuthConfig.getTokenHeader(), BaseContextHandler.getToken())
                .build();
        Response response = chain.proceed(newRequest);
        return response;
    }
}
