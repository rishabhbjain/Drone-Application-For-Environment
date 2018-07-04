/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rendor;

import Business.Inventory.Inventory;

/**
 *
 * @author runhzx
 */
public class Rendor {
    private String rendorName;
    private int rendorId;
    private static int count = 1;
    private Inventory inventory;
    
    public Rendor() {
        rendorId = count;
        count++;
    } 

    public String getRendorName() {
        return rendorName;
    }

    public void setRendorName(String rendorName) {
        this.rendorName = rendorName;
    }

    public int getRendorId() {
        return rendorId;
    }

    public void setRendorId(int rendorId) {
        this.rendorId = rendorId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rendor.count = count;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
}
