/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class DeviceSurguryEvent {
    String description , typeOfDevice,  deviceName , manufactureName, singleUse,  medicationInvolved, HITType; 
    
    BasicComplaint bc;

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeOfDevice() {
        return typeOfDevice;
    }

    public void setTypeOfDevice(String typeOfDevice) {
        this.typeOfDevice = typeOfDevice;
    }

    

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getSingleUse() {
        return singleUse;
    }

    public void setSingleUse(String singleUse) {
        this.singleUse = singleUse;
    }

    

    public String getMedicationInvolved() {
        return medicationInvolved;
    }

    public void setMedicationInvolved(String medicationInvolved) {
        this.medicationInvolved = medicationInvolved;
    }

    public String getHITType() {
        return HITType;
    }

    public void setHITType(String HITType) {
        this.HITType = HITType;
    }

    
    
}
