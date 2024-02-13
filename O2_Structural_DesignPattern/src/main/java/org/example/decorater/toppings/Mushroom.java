package org.example.decorater.toppings;

import org.example.decorater.pizza.BasePizza;

public class Mushroom implements ToppingDecorater{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
