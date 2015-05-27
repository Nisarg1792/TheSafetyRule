/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class MedicationEvent {
    
    String substance, characterize, action, originated, intendedRoute, actualRoute;
    BasicComplaint bc;

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public String getCharacterize() {
        return characterize;
    }

    public void setCharacterize(String characterize) {
        this.characterize = characterize;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOriginated() {
        return originated;
    }

    public void setOriginated(String originated) {
        this.originated = originated;
    }

    public String getIntendedRoute() {
        return intendedRoute;
    }

    public void setIntendedRoute(String intendedRoute) {
        this.intendedRoute = intendedRoute;
    }

    public String getActualRoute() {
        return actualRoute;
    }

    public void setActualRoute(String actualRoute) {
        this.actualRoute = actualRoute;
    }

    
    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    
    
    
    
}
