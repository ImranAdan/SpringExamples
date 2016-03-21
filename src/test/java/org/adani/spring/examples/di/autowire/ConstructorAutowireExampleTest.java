package org.adani.spring.examples.di.autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:IOC_DI/config.xml"})
public class ConstructorAutowireExampleTest {


    @Autowired
    ConstructorAutowireExample constructorAutowireExample;

    @Test
    public void testGetInjectedValue() throws Exception {
        String value = constructorAutowireExample.getInjectedValue().toString();
        assertThat(value, is("HELLO WORLD"));
    }
}