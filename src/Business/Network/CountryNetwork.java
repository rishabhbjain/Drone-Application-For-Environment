/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author rishabhjain
 */
public class CountryNetwork {
  private String name;
  private StateNetworkDirectory stateNetworkDirectory;
  
  public CountryNetwork() {
      stateNetworkDirectory = new StateNetworkDirectory();
  }

    public StateNetworkDirectory getStateNetworkDirectory() {
        return stateNetworkDirectory;
    }

    public void setStateNetworkDirectory(StateNetworkDirectory stateNetworkDirectory) {
        this.stateNetworkDirectory = stateNetworkDirectory;
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
