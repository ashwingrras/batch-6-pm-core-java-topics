package org.example.generics;

public class ClassWithGenericInterface1 implements GenericInterface1<Integer, Double>
{

    @Override
    public Double printValue(Integer val) {
        return val.doubleValue();
    }
}
