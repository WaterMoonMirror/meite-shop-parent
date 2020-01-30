package com.wondersgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {

	public static void main(String[] args) {
		SpringApplication.run(AppWeiXin.class, args);
	}

	@GetMapping("/11")
	@ResponseBody
	public String add(){
	return "sdjfajdfaldfjalf;";
	}
}
