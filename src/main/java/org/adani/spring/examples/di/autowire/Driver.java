package org.adani.spring.examples.di.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC_DI/config.xml");
        runConstructorAutowireExample(context);
        runPropertyAutowireExample(context);
    }

    public static void runConstructorAutowireExample(ApplicationContext applicationContext) {
        ConstructorAutowireExample constructorAutowireExampleBean = (ConstructorAutowireExample) applicationContext.getBean("constructorAutowireExample");
        System.out.println("The constructor value that was autowired is: " + constructorAutowireExampleBean.getInjectedValue());
    }

    private static void runPropertyAutowireExample(ApplicationContext applicationContext) {
        PropertyAutowireExample PropertyAutowireExampleBean = (PropertyAutowireExample) applicationContext.getBean("propertyAutowireExample");
        System.out.println("The Property value that was Autowired is: " + PropertyAutowireExampleBean.getInjectedValue());
    }
}
