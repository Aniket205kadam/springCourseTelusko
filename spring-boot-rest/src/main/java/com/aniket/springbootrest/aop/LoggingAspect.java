package com.aniket.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return-type(*), class-name(*).method-name(*)(args(..))
    //* is the wiled cart for the add tje return type, method name
    //and for the args we use (..)
//    @Before("execution(* *.*(..))")
    @Before("execution(* com.aniket.springbootrest.service.JobService.updateJobPost(..)) || execution(* com.aniket.springbootrest.service.JobService.getJobPost(..))")
    public void logMethodCalls(JoinPoint jp) {
        LOGGER.info("method called: " + jp.getSignature().getName());
    }

    @After("execution(* com.aniket.springbootrest.service.JobService.updateJobPost(..)) || execution(* com.aniket.springbootrest.service.JobService.getJobPost(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("method Executed: " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.aniket.springbootrest.service.JobService.updateJobPost(..)) || execution(* com.aniket.springbootrest.service.JobService.getJobPost(..))")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("method has some issues: " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.aniket.springbootrest.service.JobService.updateJobPost(..)) || execution(* com.aniket.springbootrest.service.JobService.getJobPost(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("method executed successfully " + jp.getSignature().getName());
    }
}
