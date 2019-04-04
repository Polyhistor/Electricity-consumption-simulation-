/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

public class Validation {
    
    public static boolean validatealpha(String txt){
        
        String regus = "^[a-zA-Z0-9._-]{3,}$";
        if (txt.matches(regus)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean validatedigit (String txt){
        
        String regex = "\\d+";
        if (txt.matches(regex)) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public static boolean validatemonth (String txt) {
    
        String re = "^(0?[1-9]|1[012])$";
        if (txt.matches(re)) {
            return true;
        }
            
        else {
            return false;
        }
    }
    
    public static boolean validateyear (String txt) {
    
        String re = "^(20|20)\\d{2}$";
        if (txt.matches(re)) {
            return true;
        }
            
        else {
            return false;
        }
    }
    
    public static boolean validate6digits (String txt) {
    
        String re = "^[0-9]{1,6}$";
        if (txt.matches(re)) {
            return true;
        }
            
        else {
            return false;
        }
    
        
    }
    
    
}
