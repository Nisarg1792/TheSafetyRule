/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class PeriNatalEvent {
    String eventInvolve, gestation, primipara, fetus, affectedMembers,neonateOutcome, motherOutcome, fetusOutcome;
    String doDelivary, liveBirth, weight, induced, mode , instrument;

    BasicComplaint bc;

    public String getNeonateOutcome() {
        return neonateOutcome;
    }

    public void setNeonateOutcome(String neonateOutcome) {
        this.neonateOutcome = neonateOutcome;
    }

    public String getInduced() {
        return induced;
    }

    public void setInduced(String induced) {
        this.induced = induced;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    
    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    
    public String getEventInvolve() {
        return eventInvolve;
    }

    public void setEventInvolve(String eventInvolve) {
        this.eventInvolve = eventInvolve;
    }

    public String getGestation() {
        return gestation;
    }

    public void setGestation(String gestation) {
        this.gestation = gestation;
    }

    public String getPrimipara() {
        return primipara;
    }

    public void setPrimipara(String primipara) {
        this.primipara = primipara;
    }

    public String getFetus() {
        return fetus;
    }

    public void setFetus(String fetus) {
        this.fetus = fetus;
    }

    public String getAffectedMembers() {
        return affectedMembers;
    }

    public void setAffectedMembers(String affectedMembers) {
        this.affectedMembers = affectedMembers;
    }

    public String getMotherOutcome() {
        return motherOutcome;
    }

    public void setMotherOutcome(String motherOutcome) {
        this.motherOutcome = motherOutcome;
    }

    public String getFetusOutcome() {
        return fetusOutcome;
    }

    public void setFetusOutcome(String fetusOutcome) {
        this.fetusOutcome = fetusOutcome;
    }

    public String getDoDelivary() {
        return doDelivary;
    }

    public void setDoDelivary(String doDelivary) {
        this.doDelivary = doDelivary;
    }

    public String getLiveBirth() {
        return liveBirth;
    }

    public void setLiveBirth(String liveBirth) {
        this.liveBirth = liveBirth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    
}
