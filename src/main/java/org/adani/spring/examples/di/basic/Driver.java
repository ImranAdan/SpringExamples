package org.adani.spring.examples.di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:IOC_DI/config.xml");
        runConstructorDIExample(context);
        runPropertyDIExample(context);
    }


    public static void runConstructorDIExample(ApplicationContext applicationContext) {
        ConstructorDIExample constructorDIExampleBean = (ConstructorDIExample) applicationContext.getBean("constructorDIExample");
        System.out.println("The injected value for the constructor is: " + constructorDIExampleBean.getInjectedValue());
    }


    private static void runPropertyDIExample(ApplicationContext applicationContext) {
        PropertyDIExample propertyDIExampleBean = (PropertyDIExample) applicationContext.getBean("propertyDIExample");
        System.out.println("The injected value using setter is: " + propertyDIExampleBean.getInjectedValue());
    }

}
