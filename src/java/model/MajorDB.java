/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FPTSHOP
 */
public class MajorDB {
    public static String DRIVERNAME="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String DBURL="jdbc:sqlserver://localhost:1433;databaseName=PRJ301_DE180316;encrypt=false;trustServerCertificate=false;loginTimeout=30";
    public static String USERDB="sa";
    public static String PASSDB="123";
    
    public static Connection getConnect(){
        try{ 
            Class.forName(DRIVERNAME);
	} catch(ClassNotFoundException e) {
            System.out.println("Error loading driver" + e);
	}
        try{
            
            Connection con = DriverManager.getConnection(DBURL,USERDB,PASSDB);
            return con;
        }
        catch(SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
    
    public static ArrayList<Major> searchMajorByTeacher(){
          ArrayList<Major> list= new ArrayList<Major>();
          //Connection con = getConnect();
          try(Connection con = getConnect()) {
              String sql = "Select MajorID, MajorName, LeaderName from DE180316";
            PreparedStatement stmt=con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                list.add(new Major(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
            rs.close();
            con.close();
            return list;
        } catch (Exception ex) {
              System.out.println(ex);
        }   
        return null;
    }
    
    public static void main(String[] a){
        ArrayList<Major> list = MajorDB.searchMajorByTeacher();
        for (Major item: list) 
        {
            System.out.println(item);
        }
    }
        
    }
    
   
