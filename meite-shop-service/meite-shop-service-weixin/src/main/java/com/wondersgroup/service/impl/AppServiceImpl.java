package com.wondersgroup.service.impl;

import com.wondersgroup.entity.AppEntity;
import com.wondersgroup.service.AppService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppServiceImpl implements AppService {
    public AppEntity getApp() {
        return new AppEntity("644064779", "yushengjun644");
    }
}
