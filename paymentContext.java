/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

import javax.swing.JLabel;

public class paymentContext implements paymentstate {
    
    private paymentstate pstate;
 
    public void setState(paymentstate state) {
        this.pstate=state;
    }
    
    public paymentstate getState() {
        return this.pstate;
    }
 
    @Override
    public void Ptype(JLabel jtxt) {
        this.pstate.Ptype(jtxt);
    }
    
}
