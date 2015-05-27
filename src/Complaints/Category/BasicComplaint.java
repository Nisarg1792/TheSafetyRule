/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

import Locations.MedicalEntity;

/**
 *
 * @author admin
 */
public class BasicComplaint {
    String reportDate, eventReported, dicoveryDate, discoveryTime , description, location, category, patientAge, gender, race, degree, duration, reporter;
    MedicalEntity entity;
    int harmScale;

    public int getHarmScale() {
        return harmScale;
    }

    public void setHarmScale(int harmScale) {
        this.harmScale = harmScale;
    }
    
    
    public MedicalEntity getEntity() {
        return entity;
    }

    public void setEntity(MedicalEntity entity) {
        this.entity = entity;
    }
    
    public String getReportDate() {
        return reportDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getEventReported() {
        return eventReported;
    }

    public void setEventReported(String eventReported) {
        this.eventReported = eventReported;
    }

    public String getDicoveryDate() {
        return dicoveryDate;
    }

    public void setDicoveryDate(String dicoveryDate) {
        this.dicoveryDate = dicoveryDate;
    }

    public String getDiscoveryTime() {
        return discoveryTime;
    }

    public void setDiscoveryTime(String discoveryTime) {
        this.discoveryTime = discoveryTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
}
