package com.project.springAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration
public class AppConfig {
	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new MediaTek();
	}

}*/

@Configuration
@ComponentScan(basePackages="com.project.springAnnotationConfig")         //if we does not specify this
public class AppConfig {
	


}
