package com.alobcan.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspects {
    private Logger logger = Logger.getLogger(LoggerAspects.class.getName());

    @Around("execution(* com.alobcan.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + "Method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info(String.format("The method took %1$s ms to execute", timeElapsed));
        logger.info(joinPoint.getSignature().toString() + "Method execution end");
    }
}
