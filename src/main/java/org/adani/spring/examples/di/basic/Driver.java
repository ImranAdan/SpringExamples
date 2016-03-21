package org.adani.spring.examples.di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:IOC_DI/config.xml");
        ConstructorDIExample constructorDIExampleBean = (ConstructorDIExample) context.getBean("constructorDIExample");
        System.out.println("The injected value is: " + constructorDIExampleBean.getInjectedValue());
    }
}
