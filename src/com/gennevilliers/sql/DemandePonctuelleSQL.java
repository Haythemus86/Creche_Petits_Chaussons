package com.gennevilliers.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.gennevilliers.beans.DemandePonctuelle;
import com.gennevilliers.dao.DaoContext;

public class DemandePonctuelleSQL extends DaoContext {
	
	
	private int status;
	
	
	public void enregistrerDemandeEnBdd(DemandePonctuelle demande1) throws SQLException {
		
		try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword)){
			
			String commandeSQL = "INSERT INTO demandePonctuelle (arrivee,depart,email)"
					+ "VALUES (?,?,?) ";
			
			try (PreparedStatement preparedStatement = connection.prepareStatement(commandeSQL)){
				preparedStatement.setObject(1,demande1.getDateArrivee());
				preparedStatement.setObject(2,demande1.getDateDepart());
				preparedStatement.setObject(3, demande1.getEmail());
			   status = preparedStatement.executeUpdate();
			 
			 
			}
			
		}
		
	}

}
