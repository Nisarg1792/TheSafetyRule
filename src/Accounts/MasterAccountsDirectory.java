/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Roles.CityAdmin;
import Roles.ContinentAdmin;
import Roles.CountryAdmin;
import Roles.StateAdmin;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MasterAccountsDirectory {
    ArrayList<ContinentUA> continentAdmins;
    ArrayList<CountryUA> countryAdmins;
    ArrayList<StateUA> stateAdmins;
    ArrayList<CityUA> cityAdmins;
    
    public MasterAccountsDirectory() {
        continentAdmins = new ArrayList<>();
        countryAdmins = new ArrayList<>();
        stateAdmins = new ArrayList<>();
        cityAdmins = new ArrayList<>();
    }

    public ArrayList<ContinentUA> getContinentAdmins() {
        return continentAdmins;
    }

    public void setContinentAdmins(ArrayList<ContinentUA> continentAdmins) {
        this.continentAdmins = continentAdmins;
    }

    public ArrayList<CountryUA> getCountryAdmins() {
        return countryAdmins;
    }

    public void setCountryAdmins(ArrayList<CountryUA> countryAdmins) {
        this.countryAdmins = countryAdmins;
    }

    public ArrayList<StateUA> getStateAdmins() {
        return stateAdmins;
    }

    public void setStateAdmins(ArrayList<StateUA> stateAdmins) {
        this.stateAdmins = stateAdmins;
    }

    public ArrayList<CityUA> getCityAdmins() {
        return cityAdmins;
    }

    public void setCityAdmins(ArrayList<CityUA> cityAdmins) {
        this.cityAdmins = cityAdmins;
    }
    
    
    public ContinentUA verifyContinentUA(String username, String password){
        for(ContinentUA c : continentAdmins){
            if(c.userName.equals(username) && c.password.equals(password)){
                return  c;
            }
            
        }
        return null;
    }
    
    public CountryUA verifyCountryUA(String username , String password){
        for(CountryUA c : countryAdmins){
        if(c.userName.equals(username) && c.password.equals(password)){
                return  c;
            }
            
        }
        return null;
    }
    
    public StateUA verifyStateUA(String username, String password){
        for(StateUA c : stateAdmins){
            if(c.userName.equals(username) && c.password.equals(password)){
                return  c;
            }
            
        }
        return null;
    }
    
    public CityUA verifyCityUA(String username, String password){
        for(CityUA c : cityAdmins){
            if(c.userName.equals(username) && c.password.equals(password)){
                return  c;
            }
            
        }
        return null;
    }
    
    public ContinentUA createContinentAdmin(String username, String password, ContinentAdmin admin){
        ContinentUA ua = new ContinentUA(username, password, admin);
        continentAdmins.add(ua);
        return ua;
    }
    
    public CountryUA createCountryAdmin(String username, String password, CountryAdmin admin){
        CountryUA ua = new CountryUA(username, password, admin);
        countryAdmins.add(ua);
        return ua;
    }
    
    public StateUA createStateAdmin(String username, String password, StateAdmin admin){
        StateUA ua = new StateUA(username, password, admin);
        stateAdmins.add(ua);
        return ua;
    }
    
    public CityUA createCityAdmin(String username, String password, CityAdmin admin){
        CityUA ua = new CityUA(username, password, admin);
        cityAdmins.add(ua);
        return ua;
    }
    
    
    public CityAdmin findAdminByCity(String cityName){
        for(CityUA ua : cityAdmins){
            if(ua.admin.getCity().getLocation().getValue().equals(cityName))
                return ua.admin;
        }
        return null;
    }
    
}
