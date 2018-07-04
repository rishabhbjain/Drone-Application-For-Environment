/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PayRoll;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author runhzx
 */
public class PayRollDirectory {
    private ArrayList<PayRoll> payRoleList;

    public PayRollDirectory() {
        payRoleList = new ArrayList<>();
    }
     public PayRoll createPayroll(Employee employee,String salary,Date From,Date To,float hours){
        PayRoll payroll = new PayRoll();
        payroll.setEmployee(employee);
        payroll.setFrom(From);
        payroll.setTo(To);
        payroll.setHours(hours);
        payroll.setSalary(salary);
        payRoleList.add(payroll);
        return payroll;
    }
    
    public void deletePayroll(PayRoll payroll){
        payRoleList.remove(payroll);
    }

    public ArrayList<PayRoll> getPayRoleList() {
        return payRoleList;
    }

    public void setPayRoleList(ArrayList<PayRoll> payRoleList) {
        this.payRoleList = payRoleList;
    }
    
}
