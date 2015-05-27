/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class BloodEvent {
    String type, eventCharacterize, incorrectaction,   eventDiscovered, eventOriginated;
    BasicComplaint bc;

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEventCharacterize() {
        return eventCharacterize;
    }

    public void setEventCharacterize(String eventCharacterize) {
        this.eventCharacterize = eventCharacterize;
    }

    public String getIncorrectaction() {
        return incorrectaction;
    }

    public void setIncorrectaction(String incorrectaction) {
        this.incorrectaction = incorrectaction;
    }

    

    public String getEventDiscovered() {
        return eventDiscovered;
    }

    public void setEventDiscovered(String eventDiscovered) {
        this.eventDiscovered = eventDiscovered;
    }

    public String getEventOriginated() {
        return eventOriginated;
    }

    public void setEventOriginated(String eventOriginated) {
        this.eventOriginated = eventOriginated;
    }
    
}
