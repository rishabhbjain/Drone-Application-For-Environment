/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Data.Data;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rishabhjain
 */
public class AssignmentDirectory {
           private ArrayList<Assignment> AssignmentList;

    public AssignmentDirectory() {
        AssignmentList = new ArrayList<>();
    }

    public ArrayList<Assignment> getAssignmentList() {
        return AssignmentList;
    }

    public void setAssignmentList(ArrayList<Assignment> AssignmentList) {
        this.AssignmentList = AssignmentList;
    }

    public Assignment createAssignment(String ProductName,String country,String state,String City,String Location, String ZipCode){
        Assignment assignment = new Assignment();
        assignment.setProductName(ProductName);
        assignment.setCountry(country);
        assignment.setState(state);
        assignment.setCity(City);
        assignment.setLocation(Location);
        assignment.setZipcode(ZipCode);
        AssignmentList.add(assignment);
        return assignment;
    }
    
    public void deleteAssignment(Assignment assignment){
        AssignmentList.remove(assignment);
    }
       
}
