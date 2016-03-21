package org.adani.spring.examples.di.basic;

public class PropertyDIExample {

    private Object injectedValue;

    public PropertyDIExample() {
    } // Empty cons

    public void setInjectedValue(Object injectedValue) {
        this.injectedValue = injectedValue;
    }

    public Object getInjectedValue() {
        return injectedValue;
    }
}
