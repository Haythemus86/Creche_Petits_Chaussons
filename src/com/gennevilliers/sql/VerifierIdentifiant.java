package com.gennevilliers.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gennevilliers.beans.Identification;
import com.gennevilliers.dao.DaoContext;

public class VerifierIdentifiant extends DaoContext {
	
	private int status;
	private ResultSet resultSet = null;
	
	
	
	public int verifierId (Identification identification1 ) throws SQLException {
		
		try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword)){
			
			String commandeSQL = "SELECT * FROM identifiants WHERE login=? AND password=?";
			
			 try (PreparedStatement preparedStatement = connection.prepareStatement(commandeSQL)){
				 
				 	preparedStatement.setString(1, identification1.getLogin());
				 	preparedStatement.setString(2, identification1.getPassword());
				 	
				 	  resultSet = preparedStatement.executeQuery();
				 	 
				 	  if (!resultSet.first()) {
				 		  return 0;
				 		
				 	  }else {
				 		  System.out.println("verification du machin ok ");
				 		  return 1;
				 	  }
				 	 
				 	 
				 	 
				 	 
				 	  
				 	  
				 
				 	  
				 	  
				 }
				 
			 }
		
		
			
		}
		
		
		
	



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
