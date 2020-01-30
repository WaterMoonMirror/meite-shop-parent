package com.wondersgroup.memberservice;

import com.wondersgroup.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface MemberService {

	@GetMapping("/memberInvokWeixin")
	 AppEntity memberInvokWeixin();

}