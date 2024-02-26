package org.example.proxy;

public class EmployeeDAOProxy implements EmployeeDAO{
    EmployeeDAOImpl employeeDAOObj;
    public EmployeeDAOProxy(){
        employeeDAOObj = new EmployeeDAOImpl();
    }
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")){
             employeeDAOObj.create(client,obj);
             return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAOObj.delete(client,employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDAOObj.get(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}
