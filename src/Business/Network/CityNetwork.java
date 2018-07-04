/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author rishabhjain
 */
public class CityNetwork {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
  
  public CityNetwork() {
      enterpriseDirectory = new EnterpriseDirectory();
  }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }  
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }    
}
