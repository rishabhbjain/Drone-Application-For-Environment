/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Network.CountryNetwork;
import Business.Network.CountryNetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private CountryNetworkDirectory countryNetworkDirectory;
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    private EcoSystem() {
        super(null);
        countryNetworkDirectory = new CountryNetworkDirectory();
    }

    public CountryNetworkDirectory getCountryNetworkDirectory() {
        return countryNetworkDirectory;
    }

    public void setCountryNetworkDirectory(CountryNetworkDirectory countryNetworkDirectory) {
        this.countryNetworkDirectory = countryNetworkDirectory;
    }

    
   
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SysAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}
