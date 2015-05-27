/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Roles.CountryAdmin;

/**
 *
 * @author admin
 */
public class CountryUA extends UserAccount{
    CountryAdmin admin;

    public CountryAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(CountryAdmin admin) {
        this.admin = admin;
    }

    public CountryUA(String username, String password,CountryAdmin admin) {
        this.userName = username;
        this.password = password;
        this.admin = admin;
    }
    
    
}
