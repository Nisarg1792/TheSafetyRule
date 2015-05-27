/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints;

import Complaints.Category.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Complaint {
    ArrayList<BloodEvent> bloodEvents;
    ArrayList<DeviceSurguryEvent> deviceSurguryEvents;
    ArrayList<FallEvent> fallEvents;
    ArrayList<InfectionEvent> infectionEvents;
    ArrayList<MedicationEvent> medicationEvents;
    ArrayList<PeriNatalEvent> periNatalEvents;
    ArrayList<PressureUlcerEvent> pressureUlcerEvents;
    ArrayList<SurgeryEvent> surgeryEvents;
    ArrayList<VenousEvent> venousEvents;

    public Complaint() {
        bloodEvents = new ArrayList<>();
        deviceSurguryEvents = new ArrayList<>();
        fallEvents = new ArrayList<>();
        infectionEvents = new ArrayList<>();
        medicationEvents = new ArrayList<>();
        periNatalEvents = new ArrayList<>();
        pressureUlcerEvents = new ArrayList<>();
        surgeryEvents = new ArrayList<>();
        venousEvents = new ArrayList<>();
    }

    public DeviceSurguryEvent createDeviceSurguryEvent(){
        DeviceSurguryEvent evt = new DeviceSurguryEvent();
        deviceSurguryEvents.add(evt);
        return evt;
    }
    public FallEvent createFallEvent(){
        FallEvent evt = new FallEvent();
        fallEvents.add(evt);
        return evt;
    }
    public BloodEvent createBloodEvent(){
        BloodEvent evt = new BloodEvent();
        bloodEvents.add(evt);
        return evt;
    }
    public InfectionEvent createInfectionEvent(){
        InfectionEvent evt = new InfectionEvent();
        infectionEvents.add(evt);
        return evt;
    }
    public MedicationEvent createMedicationEvent(){
        MedicationEvent evt = new MedicationEvent();
        medicationEvents.add(evt);
        return evt;
    }
    public PeriNatalEvent createPeriNatalEvent(){
        PeriNatalEvent evt = new PeriNatalEvent();
        periNatalEvents.add(evt);
        return evt;
    }
    public PressureUlcerEvent createPressureUlcerEvent(){
        PressureUlcerEvent evt = new PressureUlcerEvent();
        pressureUlcerEvents.add(evt);
        return evt;
    }
    public SurgeryEvent createSurgeryEvent(){
        SurgeryEvent evt = new SurgeryEvent();
        surgeryEvents.add(evt);
        return evt;
    }
    public VenousEvent createVenousEvent(){
        VenousEvent evt = new VenousEvent();
        venousEvents.add(evt);
        return evt;
    }
    
    
    public ArrayList<BloodEvent> getBloodEvents() {
        return bloodEvents;
    }

    public void setBloodEvents(ArrayList<BloodEvent> bloodEvents) {
        this.bloodEvents = bloodEvents;
    }

    public ArrayList<DeviceSurguryEvent> getDeviceSurguryEvents() {
        return deviceSurguryEvents;
    }

    public void setDeviceSurguryEvents(ArrayList<DeviceSurguryEvent> deviceSurguryEvents) {
        this.deviceSurguryEvents = deviceSurguryEvents;
    }

    public ArrayList<FallEvent> getFallEvents() {
        return fallEvents;
    }

    public void setFallEvents(ArrayList<FallEvent> fallEvents) {
        this.fallEvents = fallEvents;
    }

    public ArrayList<InfectionEvent> getInfectionEvents() {
        return infectionEvents;
    }

    public void setInfectionEvents(ArrayList<InfectionEvent> infectionEvents) {
        this.infectionEvents = infectionEvents;
    }

    public ArrayList<MedicationEvent> getMedicationEvents() {
        return medicationEvents;
    }

    public void setMedicationEvents(ArrayList<MedicationEvent> medicationEvents) {
        this.medicationEvents = medicationEvents;
    }

    public ArrayList<PeriNatalEvent> getPeriNatalEvents() {
        return periNatalEvents;
    }

    public void setPeriNatalEvents(ArrayList<PeriNatalEvent> periNatalEvents) {
        this.periNatalEvents = periNatalEvents;
    }

    public ArrayList<PressureUlcerEvent> getPressureUlcerEvents() {
        return pressureUlcerEvents;
    }

    public void setPressureUlcerEvents(ArrayList<PressureUlcerEvent> pressureUlcerEvents) {
        this.pressureUlcerEvents = pressureUlcerEvents;
    }

    public ArrayList<SurgeryEvent> getSurgeryEvents() {
        return surgeryEvents;
    }

    public void setSurgeryEvents(ArrayList<SurgeryEvent> surgeryEvents) {
        this.surgeryEvents = surgeryEvents;
    }

    public ArrayList<VenousEvent> getVenousEvents() {
        return venousEvents;
    }

    public void setVenousEvents(ArrayList<VenousEvent> venousEvents) {
        this.venousEvents = venousEvents;
    }
    
    void createFakeBloodEvent(){
        for(int i=0;i<6;i++){
                BloodEvent evt = createBloodEvent();
                evt.setEventCharacterize("Unknown");
                evt.setEventDiscovered("Sample receipt");
                evt.setEventOriginated("Product selection");
                evt.setIncorrectaction("Incorrect product");
                evt.setType("Plasma");
                BasicComplaint bc = new BasicComplaint();
                bc.setCategory("Blood or Blood Product");
                bc.setDegree("Death");
                bc.setDescription("sdfsd");
                bc.setDicoveryDate("2/5/2013");
                bc.setDiscoveryTime("04:22");
                bc.setDuration("Temporary");
                //bc.setEntity("");
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
