package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMEthod() {
		return "User service taking longer than expected Please try ag";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMEthod() {
		return "Department service taking longer than expected Please try ag";
	}

}
