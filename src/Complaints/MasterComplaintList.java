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
public class MasterComplaintList {
    ArrayList<ContinentComplaints> worldComplaintList;

    public MasterComplaintList() {
        worldComplaintList = new ArrayList<>();
        
    }
    
    public ContinentComplaints createContinentComplain(){
        ContinentComplaints c = new ContinentComplaints();
        worldComplaintList.add(c);
        return  c;
        
    }
    
    public void removeContientComplain(ContinentComplaints c){
        worldComplaintList.remove(c);
    }
    
    
}
