/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import Roles.StateAdmin;

/**
 *
 * @author admin
 */
public class StateUA extends UserAccount{
    StateAdmin admin;

    public StateAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(StateAdmin admin) {
        this.admin = admin;
    }

    public StateUA(String username, String password, StateAdmin admin) {
        this.userName = username;
        this.password = password;
        this.admin = admin;
    }
    
    
}
