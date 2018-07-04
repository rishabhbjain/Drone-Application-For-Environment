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
public class StateNetworkDirectory {
      private ArrayList<StateNetwork> stateNetworkList;

    public StateNetworkDirectory() {
        stateNetworkList = new ArrayList<StateNetwork>();
    }

    public ArrayList<StateNetwork> getStateNetworkList() {
        return stateNetworkList;
    }

    public void setStateNetworkList(ArrayList<StateNetwork> stateNetworkList) {
        this.stateNetworkList = stateNetworkList;
    }

 

    public StateNetwork createAndAddStateNetwork(String name) {
        StateNetwork stateNetwork = new StateNetwork();
        stateNetworkList.add(stateNetwork);
        stateNetwork.setName(name);
        return stateNetwork;
    }
}
