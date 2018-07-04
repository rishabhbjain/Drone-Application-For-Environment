/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

/**
 *
 * @author runhzx
 */
public class Inventory {
    private String productName;
    private int productQuantity;
    private float productPrice;
    private int inventoryId;
    private static int count = 1;
    
    public Inventory() {
        inventoryId = count;
        count++;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
    
     
    @Override
    public String toString() {
        return productName;
    }
}
