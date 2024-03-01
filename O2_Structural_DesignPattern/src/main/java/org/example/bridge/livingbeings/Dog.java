package org.example.bridge.livingbeings;

import org.example.bridge.interfaces.Breath;

public class Dog extends LivingThings{
    public Dog(Breath breath) {
        super(breath);
    }

    @Override
    public void breathProcess() {
        breathImpl.breath();
    }
}
