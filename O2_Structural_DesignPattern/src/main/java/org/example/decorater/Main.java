package org.example.decorater;

import org.example.decorater.pizza.BasePizza;
import org.example.decorater.pizza.FarmPizza;
import org.example.decorater.toppings.ExtraCheese;
import org.example.decorater.toppings.Mushroom;

public class Main {
    public  static void main(String args[]){
        BasePizza basePizza = new FarmPizza();
        System.out.println("This is basepizza cost " + basePizza.cost());

        basePizza = new Mushroom(new ExtraCheese(basePizza));
        System.out.println("Total price after toppings added " + basePizza.cost());
    }
}
