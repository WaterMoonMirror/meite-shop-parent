package com.wondersgroup.service;

import com.wondersgroup.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface AppService {
    /**
     * 获取app应用信息
     *
     * @return
     */
    @GetMapping("/getApp")
     AppEntity getApp();
}
