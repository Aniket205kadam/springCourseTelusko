package com.aniket.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.aniket.springbootrest.service.JobService.getJobPost(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint pjp, int postId) throws Throwable {

        if (postId < 0) {
            LOGGER.info("postId is negative, updating it");
            postId = Math.abs(postId);
            LOGGER.info("new value " + postId);
        }

        Object obj = pjp.proceed(new Object[]{postId});

        return obj;
    }
}
