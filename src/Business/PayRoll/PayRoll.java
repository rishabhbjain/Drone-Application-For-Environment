/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PayRoll;

import Business.Employee.Employee;
import java.util.Date;

/**
 *
 * @author runhzx
 */
public class PayRoll {
    private int id;
    private String salary;
    private Date From;
    private Date To;
    private float Hours;
    private Employee employee;
    private static int count = 1;
    
    public PayRoll() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

   

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getFrom() {
        return From;
    }

    public void setFrom(Date From) {
        this.From = From;
    }

    public Date getTo() {
        return To;
    }

    public void setTo(Date To) {
        this.To = To;
    }

    public float getHours() {
        return Hours;
    }

    public void setHours(float Hours) {
        this.Hours = Hours;
    }
    
   @Override
   public String toString(){
       return salary;
   }
    
}
