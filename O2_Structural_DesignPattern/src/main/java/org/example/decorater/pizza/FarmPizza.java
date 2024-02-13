package org.example.decorater.pizza;

public class FarmPizza implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
