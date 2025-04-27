package com.comcast.crm.generic.Databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	Connection conn; 
   public void getDbConnection(String url,String userName,String Password) throws SQLException {
	   try {
	   Driver driver = new Driver();
	   DriverManager.registerDriver(driver);
	   conn = DriverManager.getConnection(url, userName, Password);
	   }catch (Exception e) {
		System.out.println("Database is not connected");
	}
   }
   public void getDbConnection() throws SQLException {
	   try {
	   Driver driver = new Driver();
	   DriverManager.registerDriver(driver);
	   conn = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/ninza_hrm", "root@%", "root");
	   }catch (Exception e) {
		System.out.println("Database is not connected");
	}
   }
   public void closeDbConnection() {
	   try {
		   conn.close();
	   }catch (Exception e) {
		System.out.println("Database is not closed");
	}
   }
   public ResultSet executeSelectQuery(String selectQuery) throws SQLException {
	   ResultSet resultSet=null;
	   try {
	   Statement stat = conn.createStatement();
	    resultSet = stat.executeQuery(selectQuery);
	   }catch (Exception e) {
		 System.out.println("SelectQuery is not exected");  
	   }
	   return resultSet;
   }
   public int executeNonSelectQuery(String nonselectQuery) {
	   int result=0;
	   try {
	   Statement stat = conn.createStatement();
	    result = stat.executeUpdate(nonselectQuery);
	   }catch (Exception e) {
		   System.out.println("NonSelectQuery is not executed");
	}
	   return result;
   }
}
