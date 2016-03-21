package org.adani.spring.examples.di.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:IOC_DI/config.xml"})
public class PropertyDIExampleTest implements ApplicationContextAware {


    private PropertyDIExample propertyDIExampleBean;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        propertyDIExampleBean = (PropertyDIExample) applicationContext.getBean("propertyDIExample");
    }

    @Test
    public void testGetInjectedValue() throws Exception {
        String value = propertyDIExampleBean.getInjectedValue().toString();
        assertThat(value, is("HELLO WORLD"));
    }

}