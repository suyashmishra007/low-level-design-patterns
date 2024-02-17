package org.example.composite.calculator;

public class Main {
    public static void main(String[] args) {
//2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArthmeticExpression two = new Number(2);

        ArthmeticExpression one = new Number(1);
        ArthmeticExpression seven = new Number(7);

        ArthmeticExpression addExpression = new Expression(one,seven, Operation.ADD);

        ArthmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}
