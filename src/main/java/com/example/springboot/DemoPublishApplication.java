package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
 * 打包发布到tomcat8服务器
 */
@SpringBootApplication
public class DemoPublishApplication extends SpringBootServletInitializer {
     
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(DemoPublishApplication.class);
    }
 
     
    public static void main(String[] args) {
        SpringApplication.run(DemoPublishApplication.class, args);
    }
}
