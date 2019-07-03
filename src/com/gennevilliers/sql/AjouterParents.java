package com.gennevilliers.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gennevilliers.beans.Parents;
import com.gennevilliers.dao.DaoContext;

public class AjouterParents extends DaoContext {
	
	private static int status;
	

	public static void addParents ( Parents pParents ) throws SQLException {
		
		try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword)){
			
			 String sqlComannde = "INSERT INTO parents (nomDeFamille,prenom,adressePostale,codePostale,ville"
					 +",telephone,telephone2,email) VALUES (?,?,?,?,?,?,?,?);";
			
			 
			 try (PreparedStatement preparedStatement = connection.prepareStatement(sqlComannde)){
				 	
				 preparedStatement.setString(1, pParents.getNom_De_Famille());
				 preparedStatement.setString(2, pParents.getPrenom());
				 preparedStatement.setString(3, pParents.getAdresse_Postale());
				 preparedStatement.setString(4, pParents.getCode_Postale());
				 preparedStatement.setString(5, pParents.getVille());
				 preparedStatement.setString(6, pParents.getTelephone1());
				 preparedStatement.setString(7, pParents.getTelephone2());
				 preparedStatement.setString(8, pParents.getEmail());
				
				 setStatus(preparedStatement.executeUpdate());
				 
						 
			 }
		}
		
		
		
		
		
		
	}
	
	
	public static void TestConnexion() throws SQLException {
		
		try (Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword)){
			
			if ( connection != null) {
				System.out.println("connexion a la bdd reussi");
			}else {
				System.out.println("probleme de connexion");
			}
			
			
		}
		
	}


	public static int getStatus() {
		return status;
	}


	public static void setStatus(int status) {
		AjouterParents.status = status;
	}
	
	

}
