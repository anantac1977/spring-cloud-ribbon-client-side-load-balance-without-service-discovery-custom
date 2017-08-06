package com.pocs.ananta.spring.cloud.config.springcloudribbonapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonTimeConfig {

	@Bean
	public IRule ribbonRule(){
		
		return new RandomRule();
	}
}

