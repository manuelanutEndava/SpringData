package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect{
//first example before using the advice annotation
//    public void log(){
//
//    }
//@Around("execution(*org.example.services.*,*(..))")
//public void log(ProceedingJoinPoint joinPoint) {
//    joinPoint.proceed();
//}
    //
    private Logger logger= Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* org.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws  Throwable{
        logger.info("Method will execute"); //Prints a message in the console before the intercepted method's execution
        joinPoint.proceed(); // Calls the intercepted method
        logger.info("Method executed"); // Prints a message in the console after the intercepted method's execution
    }

}
