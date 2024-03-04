package org.example.bridge;

import org.example.bridge.interfaces.LandBreathImpl;
import org.example.bridge.livingbeings.Dog;
import org.example.bridge.livingbeings.LivingThings;

public class Main {
    public static void main(String[] args) {
     /*
        "Bridge pattern decouples an abstraction from an implementation so that the two can very independently"

        Difference b/t Bridge and Stragty Design
        ->  
     */
        LivingThings dog = new Dog(new LandBreathImpl());
        dog.breathProcess();
    }
}
