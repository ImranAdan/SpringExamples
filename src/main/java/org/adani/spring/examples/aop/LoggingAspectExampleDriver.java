package org.adani.spring.examples.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class LoggingAspectExampleDriver {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspectExampleDriver.class);

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP/config.xml");
        runSomeExample(context);
    }

    private static void runSomeExample(ApplicationContext context) {
        ActionPerformer actionPerformer = (ActionPerformer) context.getBean("actionPerformer");
        callSomePerformActionFunction(actionPerformer);
        callSomePerformActionAndFail(actionPerformer);
    }


    private static void callSomePerformActionFunction(ActionPerformer ap) {
        try {
            ap.doAction(Arrays.asList("a", "b", "c"));
        } catch (InterruptedException e) {
            LOGGER.error("Something went wrong...", e);
        }
    }


    private static void callSomePerformActionAndFail(ActionPerformer actionPerformer) {
        try {
            actionPerformer.doFailedAction(Arrays.asList("1", "2"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
