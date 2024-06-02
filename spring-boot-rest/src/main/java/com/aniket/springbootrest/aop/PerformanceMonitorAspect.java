package com.aniket.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.aniket.springbootrest.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        Object obj = pjp. proceed();

        long end = System.currentTimeMillis();

        LOGGER.info("Time taken by " + pjp.getSignature().getName() + " method is: " +(end - start) + " ms");

        return obj;
    }
}
