/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complaints.Category;

/**
 *
 * @author admin
 */
public class VenousEvent {
    
    String occured, testDVT, testPE, riskVTE,documentedVTE,physicalProphylaxis, pharmaProphylaxis, notGiven;
    BasicComplaint bc;

    public BasicComplaint getBc() {
        return bc;
    }

    public void setBc(BasicComplaint bc) {
        this.bc = bc;
    }

    public String getOccured() {
        return occured;
    }

    public void setOccured(String occured) {
        this.occured = occured;
    }

    public String getTestDVT() {
        return testDVT;
    }

    public void setTestDVT(String testDVT) {
        this.testDVT = testDVT;
    }

    public String getTestPE() {
        return testPE;
    }

    public void setTestPE(String testPE) {
        this.testPE = testPE;
    }

    public String getRiskVTE() {
        return riskVTE;
    }

    public void setRiskVTE(String riskVTE) {
        this.riskVTE = riskVTE;
    }

    public String getDocumentedVTE() {
        return documentedVTE;
    }

    public void setDocumentedVTE(String documentedVTE) {
        this.documentedVTE = documentedVTE;
    }

    public String getPhysicalProphylaxis() {
        return physicalProphylaxis;
    }

    public void setPhysicalProphylaxis(String physicalProphylaxis) {
        this.physicalProphylaxis = physicalProphylaxis;
    }

    public String getPharmaProphylaxis() {
        return pharmaProphylaxis;
    }

    public void setPharmaProphylaxis(String pharmaProphylaxis) {
        this.pharmaProphylaxis = pharmaProphylaxis;
    }

    public String getNotGiven() {
        return notGiven;
    }

    public void setNotGiven(String notGiven) {
        this.notGiven = notGiven;
    }
    
}
