package org.adani.spring.examples.di.basic;

/**
 * Inject a dependency through the constructor
 */
public class ConstructorDIExample {

    private final Object injectedValue;

    public ConstructorDIExample(Object someInjectedValue) {
        this.injectedValue = someInjectedValue;
    }

    public Object getInjectedValue() {
        return injectedValue;
    }
}
