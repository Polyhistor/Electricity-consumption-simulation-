/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

import javax.swing.JLabel;


public class prepaidstate implements paymentstate {
 
    @Override 
    public void Ptype(JLabel jtxt) {
        jtxt.setText("Pre-Pay");
    }
    
}
