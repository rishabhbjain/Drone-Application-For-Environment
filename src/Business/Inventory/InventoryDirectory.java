/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author runhzx
 */
public class InventoryDirectory {
        private ArrayList<Inventory> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList<>();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }
    
    
    public Inventory createInventory(String productName, float productPrice, int productQuantity){
        Inventory inventory = new Inventory();
        inventory.setProductName(productName);
        inventory.setProductPrice(productPrice);
        inventory.setProductQuantity(productQuantity);
        inventoryList.add(inventory);
        return inventory;
    }
    
    public void deleteInventory(Inventory inventory){
        inventoryList.remove(inventory);
    }
}
