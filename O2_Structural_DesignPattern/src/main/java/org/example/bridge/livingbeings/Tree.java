package org.example.bridge.livingbeings;

import org.example.bridge.interfaces.Breath;

public class Tree extends LivingThings{
    public Tree(Breath breath) {
        super(breath);
    }

    @Override
    public void breathProcess() {
        breathImpl.breath();
    }
}
