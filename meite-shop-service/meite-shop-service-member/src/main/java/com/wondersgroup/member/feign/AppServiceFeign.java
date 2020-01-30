package com.wondersgroup.member.feign;

import com.wondersgroup.service.AppService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "app-mayikt-weixin")
public interface AppServiceFeign extends AppService {

}