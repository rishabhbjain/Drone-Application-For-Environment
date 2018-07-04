/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EnvironmentDataCollectingAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EnvironmentalDataCollectingOrganization extends Organization{
     public EnvironmentalDataCollectingOrganization() {
        super(Organization.Type.EnvironmentalDataCollectingAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnvironmentDataCollectingAdminRole());
        return roles;
    }
}
