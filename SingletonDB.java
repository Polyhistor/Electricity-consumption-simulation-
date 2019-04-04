/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonDB {

    private static SingletonDB dbIsntance;
    private static Connection con ;
    private static Statement stmt;


    private SingletonDB() {
      // private constructor //
    }

    public static SingletonDB getInstance(){
    if(dbIsntance==null){
        dbIsntance= new SingletonDB();
    }
    return dbIsntance;
    }
    
    public  Connection getConnection(){

        if(con==null){
            try {
                String host = "jdbc:derby://localhost:1527/MeterSys";
                String username = "pouya";
                String password = "kilkil123";
                con = DriverManager.getConnection( host, username, password );
            } catch (SQLException ex) {
                Logger.getLogger(SingletonDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return con;
    }
}
