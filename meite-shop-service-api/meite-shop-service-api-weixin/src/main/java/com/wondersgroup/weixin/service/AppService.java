package com.wondersgroup.weixin.service;

import com.wondersgroup.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "应用信息服务")
public interface AppService {
    /**
     * 获取app应用信息
     *
     * @return
     */
    @ApiOperation(value = "获取应用信息服务")
    @GetMapping("/getApp")
     AppEntity getApp();
}
