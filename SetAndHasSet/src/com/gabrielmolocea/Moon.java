package com.gabrielmolocea;

public class Moon  extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BdyTypes.MOON);
    }
}
