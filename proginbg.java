/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class proginbg extends SwingWorker {
    
        private JProgressBar jpro;
        private JLabel jtxt;
        String username;
        
        proginbg(JProgressBar progressbar){
            this.jpro = progressbar;
        }
        
        public void settextfield (JLabel jtxt) {
            this.jtxt = jtxt;
        }
        
        public void setusername(String username) {
            this.username = username;
        }
        
        
        
        @Override
        protected Void doInBackground(){
            
              Integer a;
              
              // getting value from database 
              dataupdate dataup = dataupdate.Retrievetenant(username);
              a = dataup.getUsage();
              jpro.setValue(a);
              
              // first phase
              try{
                Thread.sleep(1500);                              
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
              
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dataupdate dup = new dataupdate();
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("first phase done");
               
              // second phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("second phase done");
              
              // third phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("third phase done");
              
              // fourth phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("fourth phase done");
              
              // fifth phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("fifth phase done");
              
              // sixth phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("sixth phase done");
              
              // 7th phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("seventh phase done");
              
              // 8th phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("eighth phase done");
              
              // 9th phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("ninth phase done");
              
              
              // 10th phase
              try{
                  Thread.sleep(1500);
              }
              catch (InterruptedException ex){
                  ex.printStackTrace();
              }
             
        
              // incrementing the progress bar
              a += 10;
              jpro.setValue(a);
              jtxt.setText(a.toString());
              
              // updating database
              dup.setUsage(a);
              dup.setUsername(username);
              dataupdate.upadtecounter(dup); 
              
              // for testing purposes
              System.out.println("tenth phase done");
              
              
            return null;
        }
        
        @Override 
        public void done(){
            JOptionPane.showMessageDialog(null,username+" has used 100 kw!");
        }
    
    
}
