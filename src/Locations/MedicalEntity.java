/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Locations;

/**
 *
 * @author admin
 */
public class MedicalEntity {
    Location location;
    String name, address, telephone, email, website;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    
    public MedicalEntity(String name, String streetAddress, String telephone, String email, String website)
    {
        location = new Location("Medical Entity", name);
        this.name = name;
        this.address = streetAddress ;
        this.telephone = telephone;
        this.email = email;
        this.website = website;
        
    }
    
    
}
