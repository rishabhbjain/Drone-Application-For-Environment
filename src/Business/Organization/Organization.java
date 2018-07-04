/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Assignment.AssignmentDirectory;
import Business.Data.DataDirectory;
import Business.DataWorkQueue.DataWorkQueue;
import Business.Employee.EmployeeDirectory;
import Business.Inventory.InventoryDirectory;
import Business.PayRoll.PayRollDirectory;
import Business.Rendor.RendorDirectory;
import Business.Rental.RentalDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author rishabhjain
 */
public abstract class Organization {
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private PayRollDirectory payRollDirectory;
    private InventoryDirectory inventoryDirectory;
    private RentalDirectory rentalDirectory;
    private RendorDirectory rendorDirectory;
    private AssignmentDirectory assignmentdirectory;
    private DataDirectory datadirectory;
    private DataWorkQueue dataWorkQueue1;
    private WorkQueue workQueue;
    private int organizationID;
    private static int counter;
    private Type type;
    
     public enum Type{
     InventoryAdmin("Inventory Organization"),    
     PayRollAdmin("PayRoll Organization"),
     RenderAdmin("Render Organization"),
     RentalAdmin("Rental Organization"),
     EnvironmentalAssignAdmin("Environmental Assign Organization"),
     EnvironmentalDataCollectingAdmin("Environmental DataCollecting Organization"),
     EnvironmentalGettingAdmin("Environmental Getting Organization"),
     EnvironmentalSendDataAdmin("Environmental SendData Organization"),
     ForestProtectorRequestData("ForestProtector RequestData Organization");
     
     
      private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        } 
     }

     public Organization(String name){
     this.name = name;
     userAccountDirectory = new UserAccountDirectory();
     employeeDirectory = new EmployeeDirectory();
     payRollDirectory = new PayRollDirectory();
     inventoryDirectory = new InventoryDirectory();
     rendorDirectory = new RendorDirectory();
     rentalDirectory = new RentalDirectory();
     assignmentdirectory = new AssignmentDirectory();
     datadirectory = new DataDirectory();
     dataWorkQueue1 = new DataWorkQueue();
     workQueue = new WorkQueue();    
     organizationID = counter;
     ++counter;
         
     }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public PayRollDirectory getPayRollDirectory() {
        return payRollDirectory;
    }

    public void setPayRollDirectory(PayRollDirectory payRollDirectory) {
        this.payRollDirectory = payRollDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }

    public RentalDirectory getRentalDirectory() {
        return rentalDirectory;
    }

    public void setRentalDirectory(RentalDirectory rentalDirectory) {
        this.rentalDirectory = rentalDirectory;
    }

    public RendorDirectory getRendorDirectory() {
        return rendorDirectory;
    }

    public void setRendorDirectory(RendorDirectory rendorDirectory) {
        this.rendorDirectory = rendorDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AssignmentDirectory getAssignmentdirectory() {
        return assignmentdirectory;
    }

    public void setAssignmentdirectory(AssignmentDirectory assignmentdirectory) {
        this.assignmentdirectory = assignmentdirectory;
    }

    public DataDirectory getDatadirectory() {
        return datadirectory;
    }

    public void setDatadirectory(DataDirectory datadirectory) {
        this.datadirectory = datadirectory;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
