package org.example.prototype;

public class StudentClass implements Prototype {
    int age ;
    private int rollNumber ;
    String name;

    @Override
    public String toString() {
        return "StudentClass{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
    StudentClass(){}

    public StudentClass(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new StudentClass(age,rollNumber,name);
    }
}
