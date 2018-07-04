/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EnvironmentSendDataAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EnvironmentalSendDataOrganization extends Organization{
     public EnvironmentalSendDataOrganization() {
        super(Organization.Type.EnvironmentalSendDataAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnvironmentSendDataAdminRole());
        return roles;
    }
}
