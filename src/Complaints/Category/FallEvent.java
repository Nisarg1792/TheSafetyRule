/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class FallEvent {
    String IsAssisted, IsObserved ,  IsInjury, priorWork, IsRiskAssessed, riskFactor, preventive, OnMedication, contribute;

    BasicComplaint bc;

    public String getContribute() {
        return contribute;
    }

    public void setContribute(String contribute) {
        this.contribute = contribute;
    }

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    
    public String getIsAssisted() {
        return IsAssisted;
    }

    public void setIsAssisted(String IsAssisted) {
        this.IsAssisted = IsAssisted;
    }

    public String getIsObserved() {
        return IsObserved;
    }

    public void setIsObserved(String IsObserved) {
        this.IsObserved = IsObserved;
    }

    
    public String getIsInjury() {
        return IsInjury;
    }

    public void setIsInjury(String IsInjury) {
        this.IsInjury = IsInjury;
    }

    public String getPriorWork() {
        return priorWork;
    }

    public void setPriorWork(String priorWork) {
        this.priorWork = priorWork;
    }

    public String getIsRiskAssessed() {
        return IsRiskAssessed;
    }

    public void setIsRiskAssessed(String IsRiskAssessed) {
        this.IsRiskAssessed = IsRiskAssessed;
    }

    

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getPreventive() {
        return preventive;
    }

    public void setPreventive(String preventive) {
        this.preventive = preventive;
    }

    public String getOnMedication() {
        return OnMedication;
    }

    public void setOnMedication(String OnMedication) {
        this.OnMedication = OnMedication;
    }

    
    
}
