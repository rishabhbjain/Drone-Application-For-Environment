/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Data.DataDirectory;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class Assignment {
     private int AssignmentId;
    private  String ProductName;
    private String State;
    private String City;
    private String Location;
    private String Zipcode;
    private Date AssignmentDate;
    private String Country;
    private DataDirectory datadirectory;
    
    private static int count = 1;
    
    public Assignment() {
        datadirectory = new DataDirectory();
        AssignmentId = count;
        count++;
    }

    public int getAssignmentId() {
        return AssignmentId;
    }

    public void setAssignmentId(int AssignmentId) {
        this.AssignmentId = AssignmentId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public Date getAssignmentDate() {
        return AssignmentDate;
    }

    public void setAssignmentDate(Date AssignmentDate) {
        this.AssignmentDate = AssignmentDate;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public DataDirectory getDatadirectory() {
        return datadirectory;
    }

    public void setDatadirectory(DataDirectory datadirectory) {
        this.datadirectory = datadirectory;
    }
    
    @Override
    public String toString() {
        return ProductName;
    }
    
}
