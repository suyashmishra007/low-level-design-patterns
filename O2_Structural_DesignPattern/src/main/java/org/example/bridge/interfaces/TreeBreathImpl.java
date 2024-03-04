package org.example.bridge.interfaces;

public class TreeBreathImpl implements Breath{
    @Override
    public void breath() {
        System.out.println("Breath through leaves");
        System.out.println("Inhale Carbon Dioxide");
        System.out.println("Exhale Oxygen through Photosynthesis");
    }
}
