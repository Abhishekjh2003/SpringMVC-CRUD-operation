package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com")
public class StudentConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
	    InternalResourceViewResolver vr = new InternalResourceViewResolver();
	    vr.setPrefix("/WEB-INF/views/");
	    vr.setSuffix(".jsp");
	    return vr;
	}

}
