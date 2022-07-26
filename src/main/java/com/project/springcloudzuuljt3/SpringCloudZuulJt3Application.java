package com.project.springcloudzuuljt3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulJt3Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudZuulJt3Application.class, args);

    }

}
