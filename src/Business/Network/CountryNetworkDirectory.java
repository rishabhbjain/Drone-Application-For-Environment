/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class CountryNetworkDirectory {
     private ArrayList<CountryNetwork> countryNetworkList;

    public CountryNetworkDirectory() {
        countryNetworkList = new ArrayList<CountryNetwork>();
    }

    public ArrayList<CountryNetwork> getCountryNetworkList() {
        return countryNetworkList;
    }

    public void setCountryNetworkList(ArrayList<CountryNetwork> countryNetworkList) {
        this.countryNetworkList = countryNetworkList;
    }

    public CountryNetwork createAndAddCountryNetwork(String name) {
        CountryNetwork countryNetwork = new CountryNetwork();
        countryNetworkList.add(countryNetwork);
        countryNetwork.setName(name);
        return countryNetwork;
    }
}
