package com.gabrielmolocea;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;
    
    public enum BdyTypes {
        STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID
    }
    
    public HeavenlyBody(String name, double orbitalPeriod, BdyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name,bodyType);
    }
    
    
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    
    public Key getKey() {
        return key;
    }
    
    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }
    
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
    
    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }
    
    public static Key makeKey(String name, BdyTypes bdyTypes){
        return new Key(name,bdyTypes);
    }
    
    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bdyTypes + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BdyTypes bdyTypes;
        
        private Key(String name,BdyTypes bdyTypes){
            this.name = name;
            this.bdyTypes=bdyTypes;
        }
    
        public String getName() {
            return name;
        }
    
        public BdyTypes getBdyTypes() {
            return bdyTypes;
        }
    
        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bdyTypes.hashCode();
        }
    
        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bdyTypes == key.getBdyTypes());
            }
            return false;
        }
    
        @Override
        public String toString() {
            return this.name + ": " + this.bdyTypes;
        }
    }
}
