package org.example.bridge.interfaces;

public class LandBreathImpl implements Breath {
    @Override
    public void breath() {
        System.out.println("Breath through nose");
        System.out.println("Inhale oxygen from Air");
        System.out.println("Exhale Carbon Dioxide");
    }
}
