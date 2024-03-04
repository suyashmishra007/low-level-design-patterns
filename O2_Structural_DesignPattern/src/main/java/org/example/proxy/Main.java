package org.example.proxy;

public class Main {

  public static void main(String[] args) {
    try {
      EmployeeDAOProxy employeeDAOProxy = new EmployeeDAOProxy();
      employeeDAOProxy.create("ADMIN", new EmployeeDo());
      System.out.println("Operation SuccessFull");
    } catch (Exception error) {
      System.out.println(error.getMessage());
    }
  }
}
/*
        1. Access Restriction
        2. Cache
        3. Pre and Post Processing(e.g Logging , Publish Event)
*/
