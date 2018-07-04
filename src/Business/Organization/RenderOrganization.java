/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RendorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class RenderOrganization extends Organization{

   public RenderOrganization() {
      super(Organization.Type.RenderAdmin.getValue());
       System.out.println("BBBBCCCCC"+(Organization.Type.RenderAdmin.getValue()));
      
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RendorAdminRole());
        return roles;
    }
    
}
