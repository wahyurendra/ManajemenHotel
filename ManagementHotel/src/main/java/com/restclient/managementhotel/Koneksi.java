/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.managementhotel;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author rnd
 */
public class Koneksi {
    public static Connection conn;
    public static void main(String args[]){
        try{
            FileReader reader = new FileReader("conf.properties");
            Properties p = new Properties();
            p.load(reader);
            String ip = p.getProperty("ip");
            String port = p.getProperty("port");
            String url = "jdbc:mysql://"+ip+":"+port+"/managementhotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("koneksi berhasil");
        }catch(Exception e){
            System.err.println("koneksi gagal" + e.getMessage());
        }
    }
    
    public static Connection connectDB(){
        String url = "jdbc:mysql://localhost:3306/managementhotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass = "";
        
        try{
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            
        } catch (SQLException e){
            System.err.println("koneksi gagal "+ e.getMessage());
        }
        return conn;
    }
    
}
