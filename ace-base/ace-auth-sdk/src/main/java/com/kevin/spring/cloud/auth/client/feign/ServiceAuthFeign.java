package com.kevin.spring.cloud.auth.client.feign;

import com.kevin.spring.cloud.auth.client.common.msg.ObjectRestResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "${auth.serviceId}", configuration = {})
public interface ServiceAuthFeign {
    @RequestMapping(value = "/client/userPubKey", method = RequestMethod.POST)
    public ObjectRestResponse<byte[]> getUserPublicKey(@RequestParam("clientId") String clientId, @RequestParam("secret") String secret);
}
