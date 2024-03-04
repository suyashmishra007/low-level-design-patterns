package org.example.flyweight;


import org.example.flyweight.Robot.*;

public class Main {

  public static void main(String[] args) {
    /*
        This patterns help to reduce the memory usage by sharing data among multiple objects.
            When to use this pattern :
            -> When memory is limited.
            -> When objects shared data.
                * Intrinsic data = shared among object and remain same once defined one value.
                * Extrinsic data = changes based on client input and differs from one object to another.
            -> Creation of object is expensive.

            How to solve this issue:
            -> From object , remove all the extrinsic data and keep instructive data (this object called flyweight object)
            -> This flyweight class can be immutable. (Cannot change) (make it private , only give getter)
            -> Extrinsic Data can be passed to the flyweight class in method parameter
            -> Once the flyweight object is created , it is cached and reused whenever required.
    */

    IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
    humanoidRobot1.display(10,30);

    IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
    humanoidRobot2.display(10,30);

    IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
    roboDog1.display(2,9);

    IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
    roboDog2.display(11,19);
  }
}
