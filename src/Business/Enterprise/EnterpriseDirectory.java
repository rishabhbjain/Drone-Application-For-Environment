/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

     public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Provider){
            enterprise = new ProviderEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Environmental){
            enterprise = new EnvironmentalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.ForestProtector){
            enterprise = new ForestProtectorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
