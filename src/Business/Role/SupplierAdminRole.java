/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierAdminWorkArea.ManageSupplierWorkAreaJPanel;

/**
 *
 * @author runhzx
 */
public class SupplierAdminRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManageSupplierWorkAreaJPanel(userProcessContainer,account,organization,enterprise,business);
    }
}
