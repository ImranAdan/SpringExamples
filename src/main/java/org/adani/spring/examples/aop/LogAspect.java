package org.adani.spring.examples.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
@Aspect
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    /**
     *
     * TODO: Complete Documentation
     * @param jp
     */
    @Before("execution(* org.adani.spring.examples.aop.*.*(..)) && within(org.adani.spring.examples.aop.*)")
    public void onEntry(JoinPoint jp) {
        String args = getJointPointArgs(jp);
        String actionMessage = "ENTRY ~> [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() +"(..) -> " + args + "]";
        LOGGER.info(actionMessage);
    }

    /**
     * TODO: Complete Documentation
     * @param jp
     */
    @After("execution(* org.adani.spring.examples.aop.*.*(..)) && within(org.adani.spring.examples.aop.*)")
    public void onExit(JoinPoint jp) {
        String args = getJointPointArgs(jp);
        String actionMessage = "EXIT ~> [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() +"(..) -> " + args + "]";
        LOGGER.info(actionMessage);
    }

    /**
     * TODO: Complete Documentation
     * @param jp
     * @param ex
     */
    @AfterThrowing(pointcut = "execution(* org.adani.spring.examples.aop.*.*(..)) && within(org.adani.spring.examples.aop.*)", throwing = "ex")
    public void onExceptionThrown(JoinPoint jp, Throwable ex) {
        String fault = "EXCEPTION [ " + ex.getMessage() + " ]";
        LOGGER.info(fault);
        String args = getJointPointArgs(jp);
        String actionMessage = fault + " ~> EXIT ~> [ " + jp.getSignature().getDeclaringTypeName() + "::" + jp.getSignature().getName() +"(..) ~> " + args +"]";
        LOGGER.info(actionMessage);
    }

    /**
     * TODO: Complete Documentation
     * @param jp
     * @return
     */
    private String getJointPointArgs(JoinPoint jp) {
        String actionArgs = "ARGS: [";
        for (int i = 0; i < jp.getArgs().length; ++i) {
            if (i == jp.getArgs().length - 1)
                actionArgs += jp.getArgs()[i].toString();
            else
                actionArgs += jp.getArgs()[i].toString() + ",";
        }
        actionArgs += "]";
        return actionArgs;
    }
}
