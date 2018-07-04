/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rental;

import Business.Inventory.Inventory;

/**
 *
 * @author runhzx
 */
public class Rental {
    private String rentalName;
    private int rentalId;
    private static int count = 1;
    private Inventory inventory;
    
    public Rental() {
        rentalId = count;
        count++;
    } 

    public String getRentalName() {
        return rentalName;
    }

    public void setRentalName(String rentalName) {
        this.rentalName = rentalName;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rental.count = count;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
}
