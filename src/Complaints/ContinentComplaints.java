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
public class ContinentComplaints {
    ArrayList<CountryComplaint> ContinentComplaintList;

    public ContinentComplaints() {
        ContinentComplaintList = new ArrayList<>();
    }
    
    public CountryComplaint createNewCountryComplaint(){
        CountryComplaint c = new CountryComplaint();
        ContinentComplaintList.add(c);
        return c;
    }
    
    public void removeCountryComplaint(CountryComplaint c){
        ContinentComplaintList.remove(c);
    }
}
