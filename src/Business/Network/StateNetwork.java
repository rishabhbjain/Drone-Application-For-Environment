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
public class StateNetwork {
  private String name;
  private CityNetworkDirectory cityNetworkDirectory;
  
  public StateNetwork() {
      cityNetworkDirectory = new CityNetworkDirectory();
  }

    public CityNetworkDirectory getCityNetworkDirectory() {
        return cityNetworkDirectory;
    }

    public void setCityNetworkDirectory(CityNetworkDirectory cityNetworkDirectory) {
        this.cityNetworkDirectory = cityNetworkDirectory;
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
