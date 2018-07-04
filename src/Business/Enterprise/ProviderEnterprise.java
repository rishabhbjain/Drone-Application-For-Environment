/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ProviderAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class ProviderEnterprise extends Enterprise {
     public ProviderEnterprise(String name) {
        super(name,EnterpriseType.Provider);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<Role>();
    roles.add(new ProviderAdminRole());
    return roles;
    }  
}
