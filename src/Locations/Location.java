/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Locations;

/**
 *
 * @author admin
 */
public class Location {
    String type;
    String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public Location(String type, String value){
        this.type = type;
        this.value = value;
    }
}
