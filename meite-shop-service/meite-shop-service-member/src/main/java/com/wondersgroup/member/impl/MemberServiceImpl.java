package com.wondersgroup.member.impl;

import com.wondersgroup.entity.AppEntity;
import com.wondersgroup.member.feign.AppServiceFeign;
import com.wondersgroup.memberservice.MemberService;
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
