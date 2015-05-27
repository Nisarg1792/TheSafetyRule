/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CountryComplaint {
    ArrayList<StateComplaints> CountryComplaintList;

    public ArrayList<StateComplaints> getCountryComplaintList() {
        return CountryComplaintList;
    }

    public void setCountryComplaintList(ArrayList<StateComplaints> CountryComplaintList) {
        this.CountryComplaintList = CountryComplaintList;
    }

    
    public CountryComplaint() {
        CountryComplaintList = new ArrayList<>();
    }
    
    public StateComplaints createNewStateComplaint(){
        StateComplaints c = new StateComplaints();
        CountryComplaintList.add(c);
        return c;
    }
    
    public void removeStateComplaint(StateComplaints c){
        CountryComplaintList.remove(c);
    }
}
