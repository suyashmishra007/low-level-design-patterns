package org.example;

import org.example.Pizza.BasePizza;
import org.example.Pizza.FarmPizza;
import org.example.Pizza.Margherita;
import org.example.Toppings.ExtraCheese;
import org.example.Toppings.Mushroom;

public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza basePizza = new Margherita();
        System.out.println(basePizza.cost());

        BasePizza customPizza =new ExtraCheese(new Mushroom(basePizza));
        System.out.println(basePizza.cost());
        basePizza = new ExtraCheese(basePizza);
        basePizza= new Mushroom(basePizza);
        System.out.println(basePizza.cost());

//        BasePizza base = new Margherita();
//        System.out.println(base.cost());
//
//        BasePizza customPizza = new ExtraCheese(new Mushroom(new FarmPizza()));
//        System.out.println(customPizza.cost());
    }
}
/*
* BasePizza p= new Margherita();
p = new ExtraCheese(p)
p = new Veggies(p)
p = new Paneer(p)
p = new mushroom(p)*/