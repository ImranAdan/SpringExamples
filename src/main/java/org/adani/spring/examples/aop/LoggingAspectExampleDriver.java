package org.adani.spring.examples.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoggingAspectExampleDriver {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspectExampleDriver.class);

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP/config.xml");
        runSomeExample(context);
    }

    private static void runSomeExample(ApplicationContext context) {
        String aopHelloWorld = (String) context.getBean("aopHelloWorld");
        callSomePrintFunction(aopHelloWorld);
    }

    private static void callSomePrintFunction(String aopHelloWorld) {
        System.out.println(aopHelloWorld);
    }
}
