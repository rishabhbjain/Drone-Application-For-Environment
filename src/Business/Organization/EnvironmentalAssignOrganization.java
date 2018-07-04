/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EnvironmentAssignAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EnvironmentalAssignOrganization extends Organization {
     public EnvironmentalAssignOrganization() {
        super(Organization.Type.EnvironmentalAssignAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnvironmentAssignAdminRole());
        return roles;
    }
}
