/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Accounts.CityUA;
import Accounts.MasterAccountsDirectory;

import Complaints.CityComplaints;
import Complaints.Complaint;
import Locations.City;
import Locations.MedicalEntity;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CityAdmin {
    
    City city;
    CityComplaints cityComplaints;
    CityUA userAccount;
    Person p;
    ArrayList<MedicalEntity> newMedicalEntityRequest;
    Complaint complaint;            //This are yet to be approved complaints
    
    public void createNewBloodEvent(){
        
    }
    public void updateAdmin(Person p, String username, String password, String location){
        this.p = p;
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        city.getLocation().setValue(location);
    }
    public Complaint getComplaint() {
        return complaint;
    }
    public int newEntityCount(){
        return newMedicalEntityRequest.size();
    }
    public int newComplaintCount(){
        int c = 0;
        c+=complaint.getBloodEvents().size();
        c+=complaint.getDeviceSurguryEvents().size();
        c+=complaint.getFallEvents().size();
        c+=complaint.getInfectionEvents().size();
        c+=complaint.getMedicationEvents().size();
        c+=complaint.getPeriNatalEvents().size();
        c+=complaint.getPressureUlcerEvents().size();
        c+=complaint.getSurgeryEvents().size();
        c+=complaint.getVenousEvents().size();
        return c;
    }
    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CityComplaints getCityComplaints() {
        return cityComplaints;
    }

    public void setCityComplaints(CityComplaints cityComplaints) {
        this.cityComplaints = cityComplaints;
    }

    public CityUA getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(CityUA userAccount) {
        this.userAccount = userAccount;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public ArrayList<MedicalEntity> getNewMedicalEntityRequest() {
        return newMedicalEntityRequest;
    }

    public void setNewMedicalEntityRequest(ArrayList<MedicalEntity> newMedicalEntityRequest) {
        this.newMedicalEntityRequest = newMedicalEntityRequest;
    }

    

    
    public CityAdmin(MasterAccountsDirectory masAccDir ,City city, CityComplaints cityComplaints , PersonDirectory pd , int personIndex) {
        this.city = city;
        this.cityComplaints = cityComplaints;
        //userAccount = masAccDir.getCityAdmins().get(masAccDir.getCityAdmins().size());
        p = pd.persons.get(personIndex);
        newMedicalEntityRequest = new ArrayList<>();
        complaint = new Complaint();
    }
    
    public MedicalEntity createRequestForEntity(String name, String streetAddress,  String telephone, String email, String website){
        MedicalEntity m = new MedicalEntity(name, streetAddress,  telephone, email, website);
        newMedicalEntityRequest.add(m);
        return m;
    }
    public MedicalEntity createNewMedicalEntity(String name, String streetAddress,  String telephone, String email, String website){
        
        MedicalEntity m =city.createNewMedicalEntity(name, streetAddress,  telephone, email, website);
        return m;
    }
    
    public void rejectEntityRequest(int index){
        newMedicalEntityRequest.remove(index);
    }
    
    public void approveEntityRequest(int index){
        city.getMedicalEntityList().add(newMedicalEntityRequest.get(index));
        newMedicalEntityRequest.remove(index);
    }
    
    public void rejectNewComplaint(String category, int index){
        switch(category){
            case "Blood or Blood Product" :
                complaint.getBloodEvents().remove(index);
                break;
            case "Device or Medical/Surgical Supply" : 
                complaint.getDeviceSurguryEvents().remove(index);
                break;
            case "Fall" :
                complaint.getFallEvents().remove(index);
                break;
            case "Healthcare-associated Infection" :
                complaint.getInfectionEvents().remove(index);
                break;
            case "Medication or Other Substance" :
                complaint.getMedicationEvents().remove(index);
                break;
            case "Perinatal" :
                complaint.getPeriNatalEvents().remove(index);
                break;
            case "Pressure Ulcer" :
                complaint.getPressureUlcerEvents().remove(index);
                break;
            case "Surgery or Anesthesia" :
                complaint.getSurgeryEvents().remove(index);
                break;
            case "Venous Thromboembolism" :
                complaint.getVenousEvents().remove(index);
                break;
        }
    }
    
    public void approveNewComplaint(String category, int index){
        switch(category){
            case "Blood or Blood Product" :
                cityComplaints.getComplaints().getBloodEvents().add(complaint.getBloodEvents().get(index));
                complaint.getBloodEvents().remove(index);
                break;
            case "Device or Medical/Surgical Supply" : 
                cityComplaints.getComplaints().getDeviceSurguryEvents().add(complaint.getDeviceSurguryEvents().get(index));
                complaint.getDeviceSurguryEvents().remove(index);
                break;
            case "Fall" :
                cityComplaints.getComplaints().getFallEvents().add(complaint.getFallEvents().get(index));
                complaint.getFallEvents().remove(index);
                break;
            case "Healthcare-associated Infection" :
                cityComplaints.getComplaints().getInfectionEvents().add(complaint.getInfectionEvents().get(index));
                complaint.getInfectionEvents().remove(index);
                break;
            case "Medication or Other Substance" :
                cityComplaints.getComplaints().getMedicationEvents().add(complaint.getMedicationEvents().get(index));
                complaint.getMedicationEvents().remove(index);
                break;
            case "Perinatal" :
                cityComplaints.getComplaints().getPeriNatalEvents().add(complaint.getPeriNatalEvents().get(index));
                complaint.getPeriNatalEvents().remove(index);
                break;
            case "Pressure Ulcer" :
                cityComplaints.getComplaints().getPressureUlcerEvents().add(complaint.getPressureUlcerEvents().get(index));
                complaint.getPressureUlcerEvents().remove(index);
                break;
            case "Surgery or Anesthesia" :
                cityComplaints.getComplaints().getSurgeryEvents().add(complaint.getSurgeryEvents().get(index));
                complaint.getSurgeryEvents().remove(index);
                break;
            case "Venous Thromboembolism" :
                cityComplaints.getComplaints().getVenousEvents().add(complaint.getVenousEvents().get(index));
                complaint.getVenousEvents().remove(index);
                break;
        }
    }
}
