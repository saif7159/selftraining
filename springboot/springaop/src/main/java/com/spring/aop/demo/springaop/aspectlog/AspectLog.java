package com.spring.aop.demo.springaop.aspectlog;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class AspectLog {

    @Pointcut("execution(* com.spring.aop.demo.springaop.controller.AspectController.get*(*))")
    public void controllerMethods(){}

    @Around("controllerMethods()")
    public Object executeStandardLogging(ProceedingJoinPoint proceedingJoinPoint){
        Object[] objects = proceedingJoinPoint.getArgs();
        String name = (String) objects[0];
        log.info("Returning name for person: " + name);
        Object object = null;
        try {
            object = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        log.info("Returning age for " + name + " : "+(int) object);
        return object;
    }
}
