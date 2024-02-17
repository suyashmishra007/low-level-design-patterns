package org.example.adapter;

import org.example.adapter.Adaptee.WeightMachineForBabies;
import org.example.adapter.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        // This works like a client.
        WeightMachineAdapterImpl weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
