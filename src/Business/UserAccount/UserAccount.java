/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Data.DataDirectory;
import Business.DataWorkQueue.DataWorkQueue;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author runhzx
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workqueue;
    private DataWorkQueue dataWorkQueue;
    private DataDirectory datadirectory;
    public UserAccount() {
        workqueue = new WorkQueue();
        dataWorkQueue = new DataWorkQueue();
    }
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public DataWorkQueue getDataWorkQueue() {
        return dataWorkQueue;
    }

    public void setDataWorkQueue(DataWorkQueue dataWorkQueue) {
        this.dataWorkQueue = dataWorkQueue;
    }

    public DataDirectory getDatadirectory() {
        return datadirectory;
    }

    public void setDatadirectory(DataDirectory datadirectory) {
        this.datadirectory = datadirectory;
    }
    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}