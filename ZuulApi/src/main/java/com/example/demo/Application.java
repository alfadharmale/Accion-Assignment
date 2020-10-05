package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication(scanBasePackages="com")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
