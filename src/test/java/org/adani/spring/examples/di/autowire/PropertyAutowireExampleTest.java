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
public class PropertyAutowireExampleTest {

    @Autowired
    PropertyAutowireExample propertyAutowireExample;

    @Test
    public void testGetInjectedValue() throws Exception {
        String value = propertyAutowireExample.getInjectedValue().toString();
        assertThat(value, is("HELLO WORLD"));
    }
}