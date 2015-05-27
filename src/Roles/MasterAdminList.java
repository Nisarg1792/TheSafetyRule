/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Accounts.ContinentUA;
import Accounts.MasterAccountsDirectory;
import Complaints.ContinentComplaints;
import Complaints.MasterComplaintList;
import Locations.Continent;
import Locations.MasterLocationList;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MasterAdminList {
    ArrayList<ContinentAdmin> continentAdminList;
    MasterAccountsDirectory masAccDir;
    MasterComplaintList  masComList;
    MasterLocationList masLocList;
    PersonDirectory pd;
    Person p;

    public ArrayList<ContinentAdmin> getContinentAdminList() {
        return continentAdminList;
    }

    public void setContinentAdminList(ArrayList<ContinentAdmin> continentAdminList) {
        this.continentAdminList = continentAdminList;
    }

    public MasterAccountsDirectory getMasAccDir() {
        return masAccDir;
    }

    public void setMasAccDir(MasterAccountsDirectory masAccDir) {
        this.masAccDir = masAccDir;
    }

    public MasterComplaintList getMasComList() {
        return masComList;
    }

    public void setMasComList(MasterComplaintList masComList) {
        this.masComList = masComList;
    }

    public MasterLocationList getMasLocList() {
        return masLocList;
    }

    public void setMasLocList(MasterLocationList masLocList) {
        this.masLocList = masLocList;
    }

    public PersonDirectory getPd() {
        return pd;
    }

    public void setPd(PersonDirectory pd) {
        this.pd = pd;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    
    public MasterAdminList() {
        continentAdminList = new ArrayList<>();
        masAccDir = new MasterAccountsDirectory();
        masComList = new MasterComplaintList();
        masLocList = new MasterLocationList();
        pd = new PersonDirectory();
        p = new Person("Main Admin", "", "", "", "", "", "", "", "");
    }
    
    public ContinentAdmin createContinentAdmin(String userName, String password, String contiName , int personIndex){
        ContinentComplaints c = masComList.createContinentComplain();
        Continent co = masLocList.createNewContinent(contiName);
        ContinentAdmin admin = new ContinentAdmin(masAccDir, c, co, pd, personIndex);
        ContinentUA ua = masAccDir.createContinentAdmin(userName, password, admin);
        admin.setUserAccount(ua);
        continentAdminList.add(admin);
        return admin;
        
    }
    
    
    
}
