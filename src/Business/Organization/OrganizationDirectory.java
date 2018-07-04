/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class OrganizationDirectory {
  private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

   public Organization createOrganization(Type type) {
   Organization organization = null;
   if (type.getValue().equals(Type.InventoryAdmin.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.PayRollAdmin.getValue())){
            organization = new PayRollOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.RenderAdmin.getValue())){
            System.out.println("TYPE:RENDER"+type.getValue().equals(Type.RenderAdmin.getValue()));
            organization = new RenderOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.RentalAdmin.getValue())){
            organization = new RentalOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.EnvironmentalAssignAdmin.getValue())){
            organization = new EnvironmentalAssignOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.EnvironmentalDataCollectingAdmin.getValue())){
            organization = new EnvironmentalDataCollectingOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.EnvironmentalGettingAdmin.getValue())){
            organization = new EnvironmentalGettingOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.EnvironmentalSendDataAdmin.getValue())){
            organization = new EnvironmentalSendDataOrganization();
            organizationList.add(organization);
        }
   if (type.getValue().equals(Type.ForestProtectorRequestData.getValue())){
            organization = new ForestProtectorRequestDataOrganization();
            organizationList.add(organization);
        }
   return organization;
   }
    
}
    
    
    
    
    
    
   
