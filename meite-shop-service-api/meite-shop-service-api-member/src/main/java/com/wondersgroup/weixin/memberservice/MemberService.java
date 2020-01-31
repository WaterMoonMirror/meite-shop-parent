package com.wondersgroup.weixin.memberservice;

import com.wondersgroup.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
@Api(tags = "会员服务")
public interface MemberService {

	@ApiOperation(value = "会员调用微信获取信息")
	@GetMapping("/memberInvokWeixin")
	 AppEntity memberInvokWeixin();

}