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
public class Country {
    Location location;
    ArrayList<State> stateList; 

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }

    
    public Country(String name) {
        location = new Location("Country", name);
        stateList = new ArrayList<>();
    }
    
    
    public State createNewState(String name){
        State s = new State(name);
        stateList.add(s);
        return s;
    }
    
    public void removeState(String stateName){
        State tempState = null;
        for(State s : stateList){
            if(s.location.value.equals(stateName)){
                tempState = s;
            }
        }
        if(tempState != null){
            stateList.remove(tempState);
        }
    }
}
