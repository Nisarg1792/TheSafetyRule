/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class SurgeryEvent {
    String decription, patientClass, isEmergency, anesthesia,  time, administor, eventDiscovery, speciality, eventType;
    String complication,  surguryCharac, anestheticEvent;

    BasicComplaint bc;

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getPatientClass() {
        return patientClass;
    }

    public void setPatientClass(String patientClass) {
        this.patientClass = patientClass;
    }

    public String getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(String isEmergency) {
        this.isEmergency = isEmergency;
    }

    public String getAnesthesia() {
        return anesthesia;
    }

    public void setAnesthesia(String anesthesia) {
        this.anesthesia = anesthesia;
    }

    

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdministor() {
        return administor;
    }

    public void setAdministor(String administor) {
        this.administor = administor;
    }

    public String getEventDiscovery() {
        return eventDiscovery;
    }

    public void setEventDiscovery(String eventDiscovery) {
        this.eventDiscovery = eventDiscovery;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getComplication() {
        return complication;
    }

    public void setComplication(String complication) {
        this.complication = complication;
    }

    

    public String getSurguryCharac() {
        return surguryCharac;
    }

    public void setSurguryCharac(String surguryCharac) {
        this.surguryCharac = surguryCharac;
    }

    public String getAnestheticEvent() {
        return anestheticEvent;
    }

    public void setAnestheticEvent(String anestheticEvent) {
        this.anestheticEvent = anestheticEvent;
    }
    
}

