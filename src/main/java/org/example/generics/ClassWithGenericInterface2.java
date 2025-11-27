package org.example.generics;

public class ClassWithGenericInterface2 implements GenericInterface1<Double, Integer>{

    @Override
    public Integer printValue(Double val) {
        return val.intValue();
    }
}
