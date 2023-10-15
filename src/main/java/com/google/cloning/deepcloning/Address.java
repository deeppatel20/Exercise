package com.google.cloning.deepcloning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address implements Cloneable {
    String city;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
