/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ForestProtectorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class ForestProtectorEnterprise extends Enterprise{
     public ForestProtectorEnterprise(String name) {
        super(name,EnterpriseType.ForestProtector);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<Role>();
    roles.add(new ForestProtectorAdminRole());
    return roles;
    }  
}
