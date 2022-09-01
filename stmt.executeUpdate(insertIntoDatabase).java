package com.diwakar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	static Connection conn;
	static Statement stmt;
			
		public static void setDBConnection() throws ClassNotFoundException, SQLException {
	    	Class.forName ("org.h2.Driver");
	        String databaseUrl = "jdbc:h2:~/h2testdb";
	        String username = "diwakar";
	        String password = "12345";
	        System.out.println("Database connection successfully");
	         conn = DriverManager.getConnection(databaseUrl, username, password);
	        
	      
	        // add application code here
	        
	        System.out.println("Creating table in given database..."); 
	        
	         stmt = conn.createStatement(); 
	         
	         
	         String sql =  "CREATE TABLE   IF NOT EXISTS Stu" + 
			           "(id INTEGER not NULL, " + 
			           " first VARCHAR(255), " +  
			           " last VARCHAR(255), " +  
			           " age INTEGER, " +  
			           " PRIMARY KEY ( id ))";
			        stmt.executeUpdate(sql);
	         }
		
		public static void insertStudent(Student  s) throws SQLException {
			 String sql = String.format("INSERT INTO stu(id, first, last, age) values(%d,'%s','%s',%d)", 
					 s.getId(), s.getFirstName(), s.getLastName(), s.getAge());
		        stmt.executeUpdate(sql);
		}
		
		public static void close() throws SQLException {
			if (stmt != null) {
				stmt.close();
			}
			
			if (conn != null) {
				conn.close();
			}
		}
}