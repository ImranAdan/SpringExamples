package org.adani.spring.examples.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorAutowireExample {


    private final String injectedValue;

    @Autowired
    public ConstructorAutowireExample(String injectedValue) {
        this.injectedValue = injectedValue;
    }

    public Object getInjectedValue() {
        return injectedValue;
    }
}
