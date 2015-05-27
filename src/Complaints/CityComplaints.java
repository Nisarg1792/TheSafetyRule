/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints;

/**
 *
 * @author admin
 */
public class CityComplaints {
    Complaint complaints;

    public Complaint getComplaints() {
        return complaints;
    }

    public void setComplaints(Complaint complaints) {
        this.complaints = complaints;
    }

    

    public CityComplaints() {
        complaints = new Complaint();
    }
    
    
    
}
