package org.example.bridge.interfaces;

public class WaterBreathImpl implements Breath{
    @Override
    public void breath() {
        System.out.println("Breath through Gills");
        System.out.println("Absorb oxygen from Water");
        System.out.println("Release Carbon Dioxide");
    }
}
