package com.guvenkarabulut.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootAOPApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAOPApplication.class,args);
    }
}
