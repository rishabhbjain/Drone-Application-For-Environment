/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ForestProtectorAdminRole;
import Business.Role.ForestProtectorRequestDataRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class ForestProtectorRequestDataOrganization extends Organization {
  
    public ForestProtectorRequestDataOrganization() {
        super(Organization.Type.ForestProtectorRequestData.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ForestProtectorRequestDataRole());
        return roles;
    }
}
