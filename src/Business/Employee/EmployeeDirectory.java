/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author runhzx
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,Date joinDate){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setJoinDate(joinDate);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee){
        employeeList.remove(employee);
    }
}