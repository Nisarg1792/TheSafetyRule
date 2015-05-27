/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Roles.ContinentAdmin;

/**
 *
 * @author admin
 */
public class ContinentUA extends UserAccount{
    ContinentAdmin  admin;

    public ContinentAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ContinentAdmin admin) {
        this.admin = admin;
    }

    
    public ContinentUA(String username, String password, ContinentAdmin admin) {
        this.userName = username;
        this.password = password;
        this.admin = admin;
    }
    
}
