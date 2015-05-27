/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class PressureUlcerEvent {
    String stage, status, statusOnAdmission, skinInspection, riskAssess, prevantive, device, morbidity;
    BasicComplaint bc;

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }

    public String getStatusOnAdmission() {
        return statusOnAdmission;
    }

    public void setStatusOnAdmission(String statusOnAdmission) {
        this.statusOnAdmission = statusOnAdmission;
    }

    public String getRiskAssess() {
        return riskAssess;
    }

    public void setRiskAssess(String riskAssess) {
        this.riskAssess = riskAssess;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getMorbidity() {
        return morbidity;
    }

    public void setMorbidity(String morbidity) {
        this.morbidity = morbidity;
    }
    
    
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSkinInspection() {
        return skinInspection;
    }

    public void setSkinInspection(String skinInspection) {
        this.skinInspection = skinInspection;
    }

    

    public String getPrevantive() {
        return prevantive;
    }

    public void setPrevantive(String prevantive) {
        this.prevantive = prevantive;
    }

    
    
    
}
