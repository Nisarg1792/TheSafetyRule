/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySystem;

import Roles.MasterAdminList;

/**
 *
 * @author admin
 */
public class EcoSystem {
    MasterAdminList ma ;

    public EcoSystem() {
        ma = new MasterAdminList();
        new ConfigureASystem(this);
    }

    public MasterAdminList getMa() {
        return ma;
    }

    public void setMa(MasterAdminList ma) {
        this.ma = ma;
    }
    
    
    
}
