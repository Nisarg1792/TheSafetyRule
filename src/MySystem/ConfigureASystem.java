/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySystem;

import Complaints.Category.BasicComplaint;
import Complaints.Category.BloodEvent;
import Roles.CityAdmin;
import Roles.ContinentAdmin;

/**
 *
 * @author admin
 */

public class ConfigureASystem {
    static EcoSystem business;

    public ConfigureASystem(EcoSystem business) {
        ConfigureASystem.business = business;
        createPerson();
        createContinentUA();
        createCountryUA();
        createStateUA();
        createCityUA();
        createEntity();
        createComplaints();
    }
    
    public static EcoSystem configure(){
        if(business==null){
            business = new EcoSystem();
        }
        return business;
    }
    void createPerson(){
        business.ma.getPd().createPerson("Admin1", "Address1", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin2", "Address2", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin3", "Address3", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin4", "Address4", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin5", "Address5", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin6", "Address6", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin7", "Address7", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin8", "Address8", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin9", "Address9", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
        business.ma.getPd().createPerson("Admin10", "Address10", "City1", "State1", "02120", "8572659879","8572659879","admin1@gmail.com", "County1");
    
    }
    void createContinentUA(){
        business.getMa().createContinentAdmin("admin1", "admin1", "North America", 0);
        business.getMa().createContinentAdmin("admin2", "admin2", "Asia", 1);
    }
    void createCountryUA(){
        business.getMa().getContinentAdminList().get(0).createCountryAdmin("admin3", "admin3", "USA", 2);
        business.getMa().getContinentAdminList().get(1).createCountryAdmin("admin4", "admin4", "India", 3);
    }
    void createStateUA(){
        business.getMa().getContinentAdminList().get(0).getCountryAdminList().get(0).createStateAdmin("admin5", "admin5", "Texas", 4);
        business.getMa().getContinentAdminList().get(1).getCountryAdminList().get(0).createStateAdmin("admin6", "admin6", "Gujarat", 5);
    }
    void createCityUA(){
        business.getMa().getContinentAdminList().get(0).getCountryAdminList().get(0).getStateAdminList().get(0).createCityAdmin("admin7", "admin7", "Dallas", 6);
        business.getMa().getContinentAdminList().get(1).getCountryAdminList().get(0).getStateAdminList().get(0).createCityAdmin("admin8", "admin8", "Ahmedabad", 6);
    }
    void createEntity(){
        business.getMa().getContinentAdminList().get(0).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0).createNewMedicalEntity("Hospital1", "Address1", "8572659879", "hospital1@gmail.com", "www.hospital1.com");
        business.getMa().getContinentAdminList().get(0).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0).createNewMedicalEntity("Hospital2", "Address2", "8572659879", "hospital2@gmail.com", "www.hospital2.com");
        business.getMa().getContinentAdminList().get(1).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0).createNewMedicalEntity("Hospital3", "Address1", "8572659879", "hospital3@gmail.com", "www.hospital3.com");
        business.getMa().getContinentAdminList().get(1).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0).createNewMedicalEntity("Hospital4", "Address2", "8572659879", "hospital42@gmail.com", "www.hospital4.com");
    }
    
    void createComplaints(){
        createFakeBloodEvent(business.getMa().getContinentAdminList().get(0).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0));
        createFakeBloodEvent(business.getMa().getContinentAdminList().get(1).getCountryAdminList().get(0).getStateAdminList().get(0).getCityAdminList().get(0));
    }
    void createFakeBloodEvent(CityAdmin c){
        
        for(int i=0;i<6;i++){
            
                BloodEvent evt = c.getCityComplaints().getComplaints().createBloodEvent();
                evt.setEventCharacterize("Unknown");
                evt.setEventDiscovered("Sample receipt");
                evt.setEventOriginated("Product selection");
                evt.setIncorrectaction("Incorrect product");
                evt.setType("Plasma");
                BasicComplaint bc = new BasicComplaint();
                bc.setCategory("Blood or Blood Product");
                if(i%2==0)
                    bc.setDegree("Death");
                else
                    bc.setDegree("Moderate harm");
                bc.setDescription("sdfsd");
                bc.setDicoveryDate((i+1)+"/5/2013");
                bc.setDiscoveryTime("04:22");
                bc.setDuration("Temporary");
                if(i%2==0)
                    bc.setEntity(c.getCity().getMedicalEntityList().get(0));
                else
                    bc.setEntity(c.getCity().getMedicalEntityList().get(1));
                bc.setEventReported("Incident");
                if(i%2==0)
                    bc.setGender("Male");
                else
                    bc.setGender("Female");
                bc.setHarmScale(0);
                bc.setLocation("Emergency department");
                bc.setPatientAge("Child (1-12 years)");
                bc.setRace("Asian");
                bc.setReportDate("2/5/2013");
                bc.setReporter("Doctor, dentist");
                evt.setBc(bc);
        }
        
        
    }
}
