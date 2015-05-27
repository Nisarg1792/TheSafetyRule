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
public class State {
   Location location;
    ArrayList<City> cityList; 

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    
    public State(String name) {
        location = new Location("State", name);
        cityList = new ArrayList<>();
    }
    
     
    public City createNewCity(String name){
        City c = new City(name);
        cityList.add(c);
        return c;
    }
    
    public void removeCity(String cityName){
        City tempCity = null;
        for(City c : cityList){
            if(c.location.value.equals(cityName)){
                tempCity = c;
            }
        }
        if(tempCity != null){
            cityList.remove(tempCity);
        }
    }
}
