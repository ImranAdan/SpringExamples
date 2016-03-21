package org.adani.spring.examples.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class PropertyAutowireExample {

    @Autowired
    private String injectedValue;

    public void setInjectedValue(String injectedValue) {
        this.injectedValue = injectedValue;
    }

    public Object getInjectedValue() {
        return injectedValue;
    }

}
