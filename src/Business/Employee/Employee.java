/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Date;

/**
 *
 * @author runhzx
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private Date joinDate;
    
    public Employee() {
        id = count;
        count++;
    }
    
    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
