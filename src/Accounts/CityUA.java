/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Roles.CityAdmin;

/**
 *
 * @author admin
 */
public class CityUA extends UserAccount{
    CityAdmin admin;

    public CityAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(CityAdmin admin) {
        this.admin = admin;
    }

    public CityUA(String username, String password,CityAdmin admin ) {
        this.userName = username;
        this.password = password;
        this.admin = admin;
    }
    
    
}
