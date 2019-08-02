package com.dbj.connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
//import com.mysql.jdbc.Connection;


public class Connect {

	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 

	public  static Connection con;
	
	public static  Connection  dbcon(String Driver,String Path,String U,String P) {
		
		
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			
			LOGGER.log(Level.WARNING, "ClassNotFoundException");
			e.printStackTrace();
		}
		try {
			con=(Connection) DriverManager.getConnection(Path,U,P);
		
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}

		LOGGER.log(Level.INFO, "Connection established \nDriver:"
				+ Driver+"\nPath:"+Path+"\nUsername:"+U+"\nPassword:"+P);
		
		return con;
	
	}	
	
	public static  void  Setdbcon(String Driver,String Path,String U,String P) {
		
		
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			
			LOGGER.log(Level.WARNING, "ClassNotFoundException");
			e.printStackTrace();
		}
		try {
			con=(Connection) DriverManager.getConnection(Path,U,P);
		
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}

		LOGGER.log(Level.INFO, "Connection established \nDriver:"
				+ Driver+"\nPath:"+Path+"\nUsername:"+U+"\nPassword:"+P);
	
	}	
}

