/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Locations;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class City {
    Location location;
    ArrayList<MedicalEntity> medicalEntityList;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<MedicalEntity> getMedicalEntityList() {
        return medicalEntityList;
    }

    public void setMedicalEntityList(ArrayList<MedicalEntity> medicalEntityList) {
        this.medicalEntityList = medicalEntityList;
    }
    
    public City(String name){
        location = new Location("City", name);
        medicalEntityList = new ArrayList<>();
    }
    
    public MedicalEntity createNewMedicalEntity(String name, String streetAddress,  String telephone, String email, String website ){
        MedicalEntity m = new MedicalEntity(name, streetAddress,  telephone, email, website);
        medicalEntityList.add(m);
        return m;
    }
    
    public void removeMedicalEntity(String medicalEntityName){
        MedicalEntity tempMedicalEntity = null;
        for(MedicalEntity m : medicalEntityList){
            if(m.location.value.equals(medicalEntityName)){
                tempMedicalEntity = m;
            }
        }
        if(tempMedicalEntity != null){
            medicalEntityList.remove(tempMedicalEntity);
        }
    }
}
