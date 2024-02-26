package org.example.proxy;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created new row in the Employee Table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with the employeeId" + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // fetch row
        System.out.println("Fetching data from the DB");
        return new EmployeeDo();
    }
}
