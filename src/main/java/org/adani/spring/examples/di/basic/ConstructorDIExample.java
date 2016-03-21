package org.adani.spring.examples.di.basic;

/**
 * Inject a dependency through the constructor
 */
public class ConstructorDIExample {

    private final String injectedValue;

    public ConstructorDIExample(String someInjectedValue) {
        this.injectedValue = someInjectedValue;
    }

    public String getInjectedValue() {
        return injectedValue;
    }
}
