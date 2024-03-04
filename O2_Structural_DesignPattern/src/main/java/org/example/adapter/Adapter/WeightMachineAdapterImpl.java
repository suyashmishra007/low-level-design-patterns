package org.example.adapter.Adapter;

import org.example.adapter.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKgs() {
        double weightInPound = weightMachine.getWeightInPound();
        // Convert to KG
        return weightInPound * 0.45;
    }
}
