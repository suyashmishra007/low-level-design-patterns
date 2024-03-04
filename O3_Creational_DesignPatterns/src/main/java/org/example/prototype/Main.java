package org.example.prototype;

import org.example.builder.Student;

public class Main {
    public static void main(String[] args) {
        // Used when we have to make copy/clone from existing object.
        StudentClass student = new StudentClass(20,12,"Hemant");
        System.out.println(student);
        Prototype student2 = student.clone();
        System.out.println(student2);
    }
}
