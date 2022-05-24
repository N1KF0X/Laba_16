package com.company;

@FunctionalInterface
public interface Converter<T, S>{
    S convert (T t);
}
