/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Inventory.Inventory;
import Business.Rental.Rental;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class RentalWorkRequest extends WorkRequest{
   private Rental rental;
   private Date from;
   private Date to;

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
   
   

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    
    
    
   
}
