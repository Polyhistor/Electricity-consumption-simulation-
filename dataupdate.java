/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dataupdate {
    
    // variables
    
    private int ID;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private int usage;
    private boolean ptype;
    private String alert;
    private int toptup;
    private String status;
    private String logs;
    
    // setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public void setPtype(boolean ptype) {
        this.ptype = ptype;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public void setToptup(int toptup) {
        this.toptup = toptup;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }
    
    
    // getters
    
    public int getID() {
        return ID;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUsage() {
        return usage;
    }

    public boolean gettype() {
        return ptype;
    }

    public String getAlert() {
        return alert;
    }

    public int getToptup() {
        return toptup;
    }

    public String getStatus() {
        return status;
    }

    public String getLogs() {
        return logs;
    }
    
    
    // updating counter
    
    public static void upadtecounter(dataupdate dup){
        
    Connection con = SingletonDB.getInstance().getConnection();
    String  sql = "update tenants SET USAGE = ? WHERE USERNAME = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, dup.getUsage());
        pst.setString(2, dup.getUsername());
        pst.executeUpdate();
        System.out.println("Tenant Counter Updated!");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
     } 
   
    }
    
    // updating status
    
    public static void updatepayment(dataupdate dup){
        
    Connection con = SingletonDB.getInstance().getConnection();
    String  sql = "update tenants SET PAYMENT = ? WHERE USERNAME = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setBoolean(1, dup.gettype());
        pst.setString(2, dup.getUsername());
        pst.executeUpdate();
        System.out.println("Tenant Payment Updated!");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
     } 
   
    }  
    
    
    // updating status
    
    public static void updatestatus(dataupdate dup){
        
    Connection con = SingletonDB.getInstance().getConnection();
    String  sql = "update tenants SET STATUS = ? WHERE USERNAME = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, dup.getStatus());
        pst.setString(2, dup.getUsername());
        pst.executeUpdate();
        System.out.println("Tenant Status Updated!");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
     } 
   
    }
    
    // updating alerts
    
    public static void updatealerts(dataupdate dup){
        
    Connection con = SingletonDB.getInstance().getConnection();
    String  sql = "update tenants SET ALERTS = ? WHERE USERNAME = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, dup.getAlert());
        pst.setString(2, dup.getUsername());
        pst.executeUpdate();
        System.out.println("Tenant Log Updated!");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
     } 
   
    }
    
    // storing logs
    
    public static void savelogs (dataupdate dup){
    Connection con = SingletonDB.getInstance().getConnection();
    String sql = "insert into logs values(?)";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, dup.getLogs());
        pst.executeUpdate();
        System.out.println("Log Saved");
    }
    catch(Exception e){
        System.out.println("Error saving log");
        e.printStackTrace();
        } 
      }
    
    
    // Saving tenants
    
    public static void Savetenant(dataupdate dup){
    Connection con = SingletonDB.getInstance().getConnection();
    String sql = "insert into tenants values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, dup.getID());
        pst.setString(2, dup.getFname());
        pst.setString(3, dup.getLname());
        pst.setString(4, dup.getUsername());
        pst.setString(5, dup.getPassword());
        pst.setInt(6, dup.getUsage());
        pst.setBoolean(7, dup.gettype());
        pst.setString(8, dup.getAlert());
        pst.setInt(9, dup.getToptup());
        pst.executeUpdate();
        System.out.println("Tenant Saved");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
    } 
  }
    
    public static void topuptenant(dataupdate dup){   
    Connection con = SingletonDB.getInstance().getConnection();
    String  sql = "update tenants SET TOPUP = ? WHERE USERNAME = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, dup.getToptup());
        pst.setString(2, dup.getUsername());
        pst.executeUpdate();
        System.out.println("Tenant topup Updated!");
    }
    catch(Exception e){
        System.out.println("Error saving tenants");
        e.printStackTrace();
     } 
   }
    
    public static dataupdate Retrievetenant(String username){
    dataupdate dataup = new dataupdate();
    Connection con = SingletonDB.getInstance().getConnection();
    String Sql = "select * from tenants where username = ?";
    try{
        PreparedStatement pst = con.prepareStatement(Sql);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            dataup.setID(rs.getInt("id"));
            dataup.setFname(rs.getString("fname"));
            dataup.setLname(rs.getString("lname"));
            dataup.setUsername(rs.getString("username"));
            dataup.setPassword(rs.getString("password"));
            dataup.setUsage(rs.getInt("usage"));
            dataup.setPtype(rs.getBoolean("payment"));
            dataup.setAlert(rs.getString("alerts"));
            dataup.setToptup(rs.getInt("topup"));
            dataup.setStatus(rs.getString("status"));
        } 
    }
    catch(Exception e){
    System.out.println("Couldn't retrieve tenant from database");
    e.printStackTrace();
    }
    return dataup;
  }  
        
    

}
