package org.example.bridge.livingbeings;

import org.example.bridge.interfaces.Breath;

public abstract class LivingThings {
    Breath breathImpl;
    public LivingThings(Breath breath){
        this.breathImpl = breath;
    }
    abstract public void breathProcess();
}
