package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        /*
         It is used when we have to create only 1 instance of the class.
         4 Ways to acheive this:
         -> Eager
         -> Lazy
         -> Synchronized Method
         -> Double locking (Used in Industries)
         */

        // Double Locking
        DBConnection connection = DBConnection.getInstance();
    }
}
