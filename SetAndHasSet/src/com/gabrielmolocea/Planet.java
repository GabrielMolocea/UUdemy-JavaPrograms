package com.gabrielmolocea;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BdyTypes.PLANET);
    }
    
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBdyTypes() == BdyTypes.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
