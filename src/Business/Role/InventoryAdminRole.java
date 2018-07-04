/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EnvironmentGettingAdminWorkArea.EnvironmentGettingAdminWorkAreaJPanel;
import userinterface.ProviderAdminWorkArea.ManageProviderWorkAreaJPanel;
import userinterface.ProviderInventoryAdminWorkArea.ManageProviderInventoryWorkAreaJPanel;
import userinterface.SupplierInventoryAdminWorkArea.ManageSupplierInventoryWorkAreaJPanel;

/**
 *
 * @author runhzx
 */
public class InventoryAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       if((String.valueOf(enterprise.getEnterpriseType())).equals("Provider")){
        return new ManageProviderInventoryWorkAreaJPanel(userProcessContainer,account,(InventoryOrganization)organization,enterprise,business);
       }
       if((String.valueOf(enterprise.getEnterpriseType())).equals("Environmental")){
        return new EnvironmentGettingAdminWorkAreaJPanel(userProcessContainer,account,(InventoryOrganization)organization,enterprise,business);
       }
       else {
        return new ManageSupplierInventoryWorkAreaJPanel(userProcessContainer,account,organization,enterprise,business);     
       }
    }
}
