package org.example.builder;

public class Main {
    public static void main(String[] args) {
        /*
            -> Big constructor parameter list
            -> Builder vs Decorater
               Disadvantage : Code Duplicacy.
        */
        Student engineeringStudent = new Director(new EngineeringStudentBuilder()).createStudent();
        System.out.println(engineeringStudent);

        Student financeStudent = new Director(new FinanceStudentBuilder()).createStudent();
        System.out.println(financeStudent);
    }
}
