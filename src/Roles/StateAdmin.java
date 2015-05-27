/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;


import Accounts.CityUA;
import Accounts.MasterAccountsDirectory;
import Accounts.StateUA;
import Complaints.CityComplaints;
import Complaints.StateComplaints;
import Locations.City;
import Locations.State;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class StateAdmin {
    ArrayList<CityAdmin> cityAdminList;
    State state;
    StateComplaints statecomplaints;
    StateUA userAccount;
    Person p;
    PersonDirectory pd;
    MasterAccountsDirectory masAccDir;

    public void updateAdmin(Person p, String username, String password, String location){
        this.p = p;
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        state.getLocation().setValue(location);
    }
    public ArrayList<CityAdmin> getCityAdminList() {
        return cityAdminList;
    }

    public void setCityAdminList(ArrayList<CityAdmin> cityAdminList) {
        this.cityAdminList = cityAdminList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public StateComplaints getStatecomplaints() {
        return statecomplaints;
    }

    public void setStatecomplaints(StateComplaints statecomplaints) {
        this.statecomplaints = statecomplaints;
    }

    public StateUA getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(StateUA userAccount) {
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

    
    public StateAdmin(MasterAccountsDirectory masAccDir ,StateComplaints statecomplaints , State state , PersonDirectory pd , int personIndex) {
        cityAdminList = new ArrayList<>();
        this.masAccDir = masAccDir;
        //userAccount = masAccDir.getStateAdmins().get(masAccDir.getStateAdmins().size());
        this.statecomplaints = statecomplaints;
        this.state = state;
        this.pd = pd;
        p = pd.persons.get(personIndex);
    }
    
    boolean alreadyExists(String uname){
        boolean flag = false;
        for(CityUA ua : masAccDir.getCityAdmins()){
            if(ua.getUserName().equalsIgnoreCase(uname))
                flag=true;
        }
        return flag;
    }
    public CityAdmin createCityAdmin(String userName, String password, String cityName , int personIndex){
        if(alreadyExists(userName)){
            return  null;
        }
        else{
            CityComplaints c = statecomplaints.createNewCityComplaint();
            City co = state.createNewCity(cityName);
            CityAdmin admin = new CityAdmin(masAccDir, co, c, pd, personIndex);
            CityUA ua = masAccDir.createCityAdmin(userName, password, admin);
            admin.setUserAccount(ua);
            cityAdminList.add(admin);
            return admin;
        }
    }
    
}
