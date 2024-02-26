package org.example.facade;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;
    public EmployeeFacade(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }
    public void insert(){
        employeeDAO.insert();
    }
    public void updateEmployeeName(){
        employeeDAO.updateEmployeeName();
    }
}
