package org.example.Toppings;

import org.example.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20; // 10 is the cost of cheese topping
    }
}
