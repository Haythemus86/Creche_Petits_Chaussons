package com.gennevilliers.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gennevilliers.beans.Enfants;
import com.gennevilliers.dao.DaoContext;

public class SQLEnfant extends DaoContext {
	
	
	
	public static void ajouterEnfants(Enfants enfant) throws SQLException {
		
		try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword)){
			
			String sqlCommande ="INSERT INTO enfants ( nomDEFamilleEnfant,prenomEnfant,age,sex,allergie)"
					+ "VALUES (?,?,?,?,?);";
			
			try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommande)){
				preparedStatement.setString(1, enfant.getNomDeFamille_Enfant());
				preparedStatement.setString(2, enfant.getPrenom_Enfant());
				preparedStatement.setString(3, enfant.getAge_Enfant());
				preparedStatement.setString(4, enfant.getSex_Enfant());
				preparedStatement.setString(5, enfant.getAllergie_Enfant());
				
				preparedStatement.executeUpdate();
				
			}
			
		}
		
		
		
		
		
	}

}
