
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public abstract class WorkRequest {
    private int id;
    private static int count = 1;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private int quantity;
    private String product;
    private Enterprise supplier;
    private String provider;
    private String rentalorrender;
    private int price;
    private Date from;
    private Date to;
    private String Country;
    private String State;
    private String City;
    private String Environment;
    public WorkRequest(){
    id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Enterprise getSupplier() {
        return supplier;
    }

    public void setSupplier(Enterprise supplier) {
        this.supplier = supplier;
    }

    public String getRentalorrender() {
        return rentalorrender;
    }

    public void setRentalorrender(String rentalorrender) {
        this.rentalorrender = rentalorrender;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getEnvironment() {
        return Environment;
    }

    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }
    
    
    
    
     @Override
    public String toString() {
        return status;
    }

}
