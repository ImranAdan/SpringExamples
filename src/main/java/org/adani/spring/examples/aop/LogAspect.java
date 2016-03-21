package org.adani.spring.examples.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);


    // TODO: Probably better if you use xml file with expressions than using annotations!

    @Before("execution(* org.adani.spring.examples..*Endpoint.*(..))")
    public void logActionEntry(JoinPoint jp) {
        String actionArgs = "ARGS [";
        for (Object obj : jp.getArgs()) {
            actionArgs += obj.toString();
        }
        actionArgs += "]";
        String actionMessage = "ACTION [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() + actionArgs + "]";
        LOGGER.info(actionMessage);
    }

    @After("execution(* org.adani.spring.examples..*Endpoint.*(..))")
    public void logActionExit(JoinPoint jp) {
        String actionArgs = "ARGS [";
        for (Object obj : jp.getArgs()) {
            actionArgs += obj.toString();
        }
        actionArgs += "]";
        String actionMessage = "ACTION [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() + actionArgs + "]";
        LOGGER.info(actionMessage);
    }

    @AfterThrowing(pointcut = "execution(* org.adani.spring.examples..*Endpoint.*(..))", throwing = "ex")
    public void logActionFault(JoinPoint jp, Throwable ex) {
        String fault = "EXCEPTION [ " + ex.getMessage() + " ]";
        String actionArgs = "ARGS [";
        for (Object obj : jp.getArgs()) {
            actionArgs += obj.toString();
        }
        actionArgs += " ] ";
        String actionMessage = fault + "\nACTION [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() + actionArgs + " ] ";
        LOGGER.info(actionMessage);
    }


}
