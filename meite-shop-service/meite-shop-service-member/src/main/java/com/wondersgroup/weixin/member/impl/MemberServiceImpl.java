package com.wondersgroup.weixin.member.impl;

import com.wondersgroup.weixin.entity.AppEntity;
import com.wondersgroup.weixin.member.feign.AppServiceFeign;
import com.wondersgroup.weixin.memberservice.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
	@Autowired
	private AppServiceFeign appServiceFeign;

	public AppEntity memberInvokWeixin() {
		return appServiceFeign.getApp();
	}

}
