package com.oop.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.user;

public class userDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<user> validate(String nic, String password) {
		
		ArrayList<user> us = new ArrayList<>();

		//create database connection
		String url = "jdbc:mysql://localhost:3306/ticket"; 
		String user ="root";
		String pass  ="admin";
		
		
		//validate

		try {
		    
		    Class.forName("com.mysql.jdbc.Driver");
		    
		    Connection con = DriverManager.getConnection(url, user, pass);
		    Statement stmt = con.createStatement();
		    String sql = "select * from user where nic='"+nic+"' and password='"+password+"'";	    
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    
		    if(rs.next()) {
			String nic_u = rs.getString(1);
			String fname = rs.getString(2);
			String lname = rs.getString(3);
			String mobile = rs.getString(4);
			String email = rs.getString(5);
			String address = rs.getString(6);
			String password_u= rs.getString(7);
			String departure = rs.getString(8);
			String arrive= rs.getString(9);
			String date = rs.getString(10);
			String tripId = rs.getString(11);
			
			
			user u = new user(nic_u,fname,lname,mobile,email,address,password_u,departure,arrive,date,tripId);
			us.add(u);
		    }
		
		    
		}
		catch(Exception e) {
		    e.printStackTrace();
		}
		
	 return us;
}

 
	
	public static boolean updateuser(String nic, String fname, String lname, String mobile, String email, String address, String password, String departure, String arrive, String date, String tripId) {
		
		//create DB Connection
				String url = "jdbc:mysql://localhost:3306/ticket"; 
				String user ="root";
				String pass  ="admin";
				
				try {
		    		
					 Class.forName("com.mysql.jdbc.Driver");		        	  
					 
						Connection con = DriverManager.getConnection(url, user, pass);
						Statement stmt = con.createStatement();
						String sql = "update user set nic='"+nic+"',fname='"+fname+"',lname='"+lname+"',mobile='"+mobile+"',email='"+email+"',address='"+address+"',password='"+password+"',departure='"+departure+"',arrive='"+arrive+"',date='"+date+"',tripId='"+tripId+"'"    
		    				+ "where nic='"+nic+"'";
		    		int rs = stmt.executeUpdate(sql);
		    		
		    		if(rs > 0) {
		    			isSuccess = true;
		    		}
		    		else {
		    			isSuccess = false;
		    		}
		    		
		    	}
		    	catch(Exception e) {
		    		e.printStackTrace();
		    	}
				
				
				
		return isSuccess;
	}
	

     public static List<user> getUserDetails(String nic_u) {    	   	 
    	
    	ArrayList<user> us = new ArrayList<>();
    	

		//create DB Connection
		String url = "jdbc:mysql://localhost:3306/ticket"; 
		String user ="root";
		String pass  ="admin";
    	
    	try {    		  		 
    		
    		 Class.forName("com.mysql.jdbc.Driver");		        	  
    		 
    			Connection con = DriverManager.getConnection(url, user, pass);
    			Statement stmt = con.createStatement();
    		    String sql = "select * from user where nic='"+nic_u+"'";
    		    rs = stmt.executeQuery(sql);
    		    
    		    System.out.println(rs);
    		   
    		    
    		
    		while(rs.next()) {
    			String nic = rs.getString(1);
    			String fname = rs.getString(2);
    			String lname = rs.getString(3);
    			String mobile = rs.getString(4);
    			String email = rs.getString(5);
    			String address = rs.getString(6);
    			String password = rs.getString(7);
    			String departure = rs.getString(8);
    			String arrive = rs.getString(9);
    			String date = rs.getString(10);
    			String tripId = rs.getString(11);
    			
    			user u = new user(nic, fname, lname, mobile, email, address, password, departure, arrive, date, tripId);
    			us.add(u);
    			
    		
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return us;	
    }

     public static boolean insertcontactus(String nic, String email, String message) {
    	 
     	boolean isSuccess = false;
     	
    	//create DB Connection
		String url = "jdbc:mysql://localhost:3306/ticket"; 
		String user ="root";
		String pass  ="admin";
		
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "insert into contactus values('"+nic+"','"+email+"','"+message+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    							
		}
		catch (Exception e) {
    		e.printStackTrace();
    	}
     	
     	
     	return isSuccess;   	

     }

     public static boolean cancelTicket(String nic) {
    	 
    	//create DB Connection
 		String url = "jdbc:mysql://localhost:3306/ticket"; 
 		String user ="root";
 		String pass  ="admin";
    	 
    	 try {
    		 
    		 Class.forName("com.mysql.jdbc.Driver");
 			
 			Connection con = DriverManager.getConnection(url, user, pass);
 			Statement stmt = con.createStatement();
    		String sql = "delete from user where nic = '"+nic+"'";
    		 int r = stmt.executeUpdate(sql);
    		 
    		 if(r > 0) {
    			 isSuccess = true;
    		 }
    		 else {
    			 isSuccess = false;
    		 }
    		 
    		 
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }   
        
     
     
     return isSuccess;
     }
     
}
    	 
	
