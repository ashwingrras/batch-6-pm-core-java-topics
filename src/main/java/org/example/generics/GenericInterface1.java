package org.example.generics;

@FunctionalInterface
public interface GenericInterface1<K,V>
{
    V printValue(K val);
}
