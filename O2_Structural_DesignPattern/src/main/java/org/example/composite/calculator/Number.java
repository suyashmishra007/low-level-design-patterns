package org.example.composite.calculator;

public class Number implements ArthmeticExpression{
    int value ;
    public Number(int value){
        this.value = value;
    }
    @Override
    public int evaluate(){
        System.out.println("Number value is " + value);
        return value;
    }
}
