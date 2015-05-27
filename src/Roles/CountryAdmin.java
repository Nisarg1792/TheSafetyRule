/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Accounts.CountryUA;
import Accounts.MasterAccountsDirectory;
import Accounts.StateUA;
import Complaints.CountryComplaint;
import Complaints.StateComplaints;
import Locations.Country;
import Locations.State;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CountryAdmin {
    ArrayList<StateAdmin> stateAdminList;
    Country country;
    CountryComplaint countrycomplaints;
    CountryUA userAccount;
    Person p;
    PersonDirectory pd;
    MasterAccountsDirectory masAccDir;

    public void updateAdmin(Person p, String username, String password, String location){
        this.p = p;
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        country.getLocation().setValue(location);
    }
    public ArrayList<StateAdmin> getStateAdminList() {
        return stateAdminList;
    }

    public void setStateAdminList(ArrayList<StateAdmin> stateAdminList) {
        this.stateAdminList = stateAdminList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public CountryComplaint getCountrycomplaints() {
        return countrycomplaints;
    }

    public void setCountrycomplaints(CountryComplaint countrycomplaints) {
        this.countrycomplaints = countrycomplaints;
    }

    public CountryUA getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(CountryUA userAccount) {
        this.userAccount = userAccount;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public PersonDirectory getPd() {
        return pd;
    }

    public void setPd(PersonDirectory pd) {
        this.pd = pd;
    }

    public MasterAccountsDirectory getMasAccDir() {
        return masAccDir;
    }

    public void setMasAccDir(MasterAccountsDirectory masAccDir) {
        this.masAccDir = masAccDir;
    }

    
    public CountryAdmin(MasterAccountsDirectory masAccDir ,CountryComplaint countrycomplaints , Country country , PersonDirectory pd , int personIndex) {
        stateAdminList = new ArrayList<>();
        this.masAccDir = masAccDir;
        //userAccount = masAccDir.getCountryAdmins().get(masAccDir.getCountryAdmins().size());
        this.countrycomplaints = countrycomplaints;
        this.country = country;
        this.pd = pd;
        p = pd.persons.get(personIndex);
    }
    
    boolean alreadyExists(String uname){
        boolean flag = false;
        for(StateUA ua : masAccDir.getStateAdmins()){
            if(ua.getUserName().equalsIgnoreCase(uname))
                flag=true;
        }
        return flag;
    }
    public StateAdmin createStateAdmin(String userName, String password, String stateName , int personIndex){
       if(alreadyExists(userName)){
            return  null;
        }
       else{
            StateComplaints c = countrycomplaints.createNewStateComplaint();
            State co = country.createNewState(stateName);
            StateAdmin admin = new StateAdmin(masAccDir, c, co, pd, personIndex);
            StateUA ua = masAccDir.createStateAdmin(userName, password, admin);
            admin.setUserAccount(ua);
            stateAdminList.add(admin);
            return admin;
       }
    }
    
}
