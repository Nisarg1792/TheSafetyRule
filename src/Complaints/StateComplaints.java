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
public class StateComplaints {
    ArrayList<CityComplaints> stateComplaintList;

    public ArrayList<CityComplaints> getStateComplaintList() {
        return stateComplaintList;
    }

    public void setStateComplaintList(ArrayList<CityComplaints> stateComplaintList) {
        this.stateComplaintList = stateComplaintList;
    }

    
    public StateComplaints() {
        stateComplaintList = new ArrayList<>();
    }
    
    public CityComplaints createNewCityComplaint(){
        CityComplaints c = new CityComplaints();
        stateComplaintList.add(c);
        return c;
    }
    
    public void removeCityComplaint(CityComplaints c){
        stateComplaintList.remove(c);
    }
    
    
}
