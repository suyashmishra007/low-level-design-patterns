package org.example.decorater.toppings;

import org.example.decorater.pizza.BasePizza;

public class ExtraCheese implements ToppingDecorater{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
