/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EnviromentalAdminRole;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EnvironmentalEnterprise extends Enterprise{
     public EnvironmentalEnterprise(String name) {
        super(name,EnterpriseType.Environmental);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<Role>();
    roles.add(new EnviromentalAdminRole());
    return roles;
    }  
}
