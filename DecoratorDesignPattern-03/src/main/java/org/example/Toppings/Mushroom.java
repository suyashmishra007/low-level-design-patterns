package org.example.Toppings;

import org.example.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10; // 10 is the cost of musroom topping
    }
}
