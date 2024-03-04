package org.example.bridge.livingbeings;

import org.example.bridge.interfaces.Breath;

public class Fish extends LivingThings{
    public Fish(Breath breath) {
        super(breath);
    }

    @Override
    public void breathProcess() {
        breathImpl.breath();
    }
}
