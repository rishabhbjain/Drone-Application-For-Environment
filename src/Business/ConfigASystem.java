/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Network.CountryNetwork;
import Business.Role.SysAdminRole;

import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author rishabhjain
 */
public class ConfigASystem {
    
    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        Date joindate = new Date();
        try {
             joindate =new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2012");
             System.out.println("DATE"+joindate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid date");
        }
        CountryNetwork countryNetwork = system.getCountryNetworkDirectory().createAndAddCountryNetwork("USA");
         Employee employee = system.getEmployeeDirectory().createEmployee("Sys",joindate);
         UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sys","sys", employee,new SysAdminRole());
         return system;        
                 
                 
    }
    
}
