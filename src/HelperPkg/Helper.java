/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperPkg;

import javax.swing.JComboBox;

/**
 *
 * @author admin
 */
public class Helper {
    public boolean isStringProper(String... stg){
        boolean flag = true;
        for(String s : stg){
            if(s.trim().isEmpty()){
                flag = false;
            }
        }
        return flag;
    } 
    public boolean isProperLength(String s, int length){
        if(s.trim().length()==length){
            return true;
        }
        else{
            return false;
        }
    }
    public int getIndexForComboBox(String s, JComboBox cb){
        
        
        for(int i=0;i<cb.getItemCount();i++){
            String cbStg= cb.getItemAt(i).toString().trim();
            String cbt = cbStg.trim();
            if(cbt.equalsIgnoreCase(s.trim()))
                return i;
        }
        return 1;
    }
}
