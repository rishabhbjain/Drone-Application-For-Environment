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
public class CityNetworkDirectory {
      private ArrayList<CityNetwork> cityNetworkList;

    public CityNetworkDirectory() {
        cityNetworkList = new ArrayList<CityNetwork>();
    }

    public ArrayList<CityNetwork> getCityNetworkList() {
        return cityNetworkList;
    }

    public void setCityNetworkList(ArrayList<CityNetwork> cityNetworkList) {
        this.cityNetworkList = cityNetworkList;
    }

    public CityNetwork createAndAddCityNetwork(String name) {
        CityNetwork cityNetwork = new CityNetwork();
        cityNetworkList.add(cityNetwork);
        cityNetwork.setName(name);
        return cityNetwork;
    }
}
