package org.adani.spring.examples.di.basic;

public class ConstructorDIExample {

    private final String injectedValue;

    public ConstructorDIExample(String someInjectedValue) {
        this.injectedValue = someInjectedValue;
    }

    public String getInjectedValue() {
        return injectedValue;
    }
}
