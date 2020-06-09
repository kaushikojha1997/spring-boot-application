package com.example.springboot.aop;

import jdk.jfr.DataAmount;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
@Slf4j
public class Useraop {
    @Before("execution(* com.example.springboot..*(..))")
    public void testBefore(){
        System.out.println("HELLO");
        log.info("Hello");

    }

    @After("execution(* com.example.springboot..*(..))")
    public void testAfter(){
        System.out.println("BYE");
        log.info("BYE");

    }
}
