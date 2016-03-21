package org.adani.spring.examples.di.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:IOC_DI/config.xml"})
public class ConstructorDIExampleTest implements ApplicationContextAware {

    private ConstructorDIExample constructorDIExample;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        constructorDIExample = (ConstructorDIExample) applicationContext.getBean("constructorDIExample");
    }

    @Test
    public void testGetInjectedValue() throws Exception {
        String value = constructorDIExample.getInjectedValue().toString();
        assertThat(value, is("HELLO WORLD"));
    }
}