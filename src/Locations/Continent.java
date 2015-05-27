/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Locations;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Continent {
    Location location;
    ArrayList<Country> countryList;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    
    public Continent(String name) {
        location = new Location("Continent", name);
        countryList = new ArrayList<>();
    }
    
    
    public Country createNewCountry(String name){
        Country c = new Country(name);
        countryList.add(c);
        return c;
    }
    
    public void removeCountry(String countryName){
                Country tempCountry = null;
        for(Country c : countryList){
            if(c.location.value.equals(countryName)){
                tempCountry = c;
            }
        }
        if(tempCountry != null){
            countryList.remove(tempCountry);
        }
    }
}
