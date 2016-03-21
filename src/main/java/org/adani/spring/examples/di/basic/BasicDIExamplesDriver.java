package org.adani.spring.examples.di.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicDIExamplesDriver {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicDIExamplesDriver.class);

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:IOC_DI/config.xml");
        runConstructorDIExample(context);
        runPropertyDIExample(context);
    }


    public static void runConstructorDIExample(ApplicationContext applicationContext) {
        ConstructorDIExample constructorDIExampleBean = (ConstructorDIExample) applicationContext.getBean("constructorDIExample");
        LOGGER.info("The injected value for the constructor is: " + constructorDIExampleBean.getInjectedValue());
    }


    private static void runPropertyDIExample(ApplicationContext applicationContext) {
        PropertyDIExample propertyDIExampleBean = (PropertyDIExample) applicationContext.getBean("propertyDIExample");
        LOGGER.info("The injected value using setter is: " + propertyDIExampleBean.getInjectedValue());
    }

}
