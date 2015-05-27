/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Accounts.ContinentUA;
import Accounts.CountryUA;
import Accounts.MasterAccountsDirectory;
import Complaints.ContinentComplaints;
import Complaints.CountryComplaint;
import Locations.Continent;
import Locations.Country;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ContinentAdmin {
    ArrayList<CountryAdmin> countryAdminList;
    Continent continent;
    ContinentComplaints continentcomplaints;
    ContinentUA userAccount;
    Person p;
    PersonDirectory pd;
    MasterAccountsDirectory masAccDir;

    public void updateAdmin(Person p, String username, String password, String location){
        this.p = p;
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        continent.getLocation().setValue(location);
    }
    public ArrayList<CountryAdmin> getCountryAdminList() {
        return countryAdminList;
    }

    public void setCountryAdminList(ArrayList<CountryAdmin> countryAdminList) {
        this.countryAdminList = countryAdminList;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public ContinentComplaints getContinentcomplaints() {
        return continentcomplaints;
    }

    public void setContinentcomplaints(ContinentComplaints continentcomplaints) {
        this.continentcomplaints = continentcomplaints;
    }

    public ContinentUA getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(ContinentUA userAccount) {
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
    
    public ContinentAdmin(MasterAccountsDirectory masAccDir ,ContinentComplaints continentcomplaints , Continent continent , PersonDirectory pd , int personIndex ) {
        countryAdminList = new ArrayList<>();
        this.masAccDir = masAccDir;
        //userAccount = masAccDir.getContinentAdmins().get(masAccDir.getContinentAdmins().size());
        this.continentcomplaints = continentcomplaints;
        this.continent = continent;
        this.pd = pd;
        p = pd.persons.get(personIndex);
    }
    
    boolean alreadyExists(String uname){
        boolean flag = false;
        for(CountryUA ua : masAccDir.getCountryAdmins()){
            if(ua.getUserName().equalsIgnoreCase(uname))
                flag=true;
        }
        return flag;
    }
    public CountryAdmin createCountryAdmin(String userName, String password, String countryName , int personIndex){
        if(alreadyExists(userName)){
            return  null;
        }
        else{
            CountryComplaint c = continentcomplaints.createNewCountryComplaint();
            Country co = continent.createNewCountry(countryName);
            CountryAdmin admin = new CountryAdmin(masAccDir, c, co, pd, personIndex);
            CountryUA ua = masAccDir.createCountryAdmin(userName, password, admin);
            admin.setUserAccount(ua);
            countryAdminList.add(admin);
            return admin;
        }
    }
    
    
}
