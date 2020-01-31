package com.wondersgroup.weixin.member.feign;

import com.wondersgroup.weixin.service.AppService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "app-mayikt-weixin")
public interface AppServiceFeign extends AppService {

}