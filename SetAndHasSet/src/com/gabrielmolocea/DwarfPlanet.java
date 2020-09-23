package com.gabrielmolocea;

public class DwarfPlanet extends HeavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BdyTypes.DWARF_PLANET);
    }
}
