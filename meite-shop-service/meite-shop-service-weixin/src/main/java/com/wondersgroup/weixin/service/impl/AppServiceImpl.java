package com.wondersgroup.weixin.service.impl;

import com.wondersgroup.weixin.entity.AppEntity;
import com.wondersgroup.weixin.service.AppService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppServiceImpl implements AppService {
    public AppEntity getApp() {
        return new AppEntity("644064779", "yushengjun644");
    }
}
