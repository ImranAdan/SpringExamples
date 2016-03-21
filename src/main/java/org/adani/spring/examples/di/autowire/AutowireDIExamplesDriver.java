package org.adani.spring.examples.di.autowire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDIExamplesDriver {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutowireDIExamplesDriver.class);

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC_DI/config.xml");
        runConstructorAutowireExample(context);
        runPropertyAutowireExample(context);
    }

    public static void runConstructorAutowireExample(ApplicationContext applicationContext) {
        ConstructorAutowireExample constructorAutowireExampleBean = (ConstructorAutowireExample) applicationContext.getBean("constructorAutowireExample");
        LOGGER.info("The constructor value that was autowired is: " + constructorAutowireExampleBean.getInjectedValue());
    }

    private static void runPropertyAutowireExample(ApplicationContext applicationContext) {
        PropertyAutowireExample PropertyAutowireExampleBean = (PropertyAutowireExample) applicationContext.getBean("propertyAutowireExample");
        LOGGER.info("The Property value that was Autowired is: " + PropertyAutowireExampleBean.getInjectedValue());
    }
}
