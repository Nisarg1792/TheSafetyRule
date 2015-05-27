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
public class MasterLocationList {
    ArrayList<Continent> continentList;

    public MasterLocationList() {
        continentList = new ArrayList<>();
    }
    
    public Continent createNewContinent(String name){
        Continent c = new Continent(name);
        continentList.add(c);
        return  c;
    }
    
    public void removeContinent(String continentName){
                Continent tempContinent = null;
        for(Continent c : continentList){
            if(c.location.value.equals(continentName)){
                tempContinent = c;
            }
        }
        if(tempContinent != null){
            continentList.remove(tempContinent);
        }
    }
    
}
