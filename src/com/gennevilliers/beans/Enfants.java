package com.gennevilliers.beans;

import java.io.Serializable;

public class Enfants implements Serializable{

	private String nomDeFamille_Enfant;
	private String prenom_Enfant;
	private String age_Enfant;
	private String sex_Enfant;
	private String allergie_Enfant;
	
	
	/**
	 * Constructeur par defaut
	 */
	public Enfants() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//GETTERS
	
	
	public String getNomDeFamille_Enfant() {
		return nomDeFamille_Enfant;
	}
	
	public String getPrenom_Enfant() {
		return prenom_Enfant;
	}
	
	public String getAge_Enfant() {
		return age_Enfant;
	}
	
	public String getSex_Enfant() {
		return sex_Enfant;
	}
	
	public String getAllergie_Enfant() {
		return allergie_Enfant;
	}
	
	
	
	
	//SETTERS
	
	public void setNomDeFamille_Enfant(String nomDeFamille_Enfant) {
		this.nomDeFamille_Enfant = nomDeFamille_Enfant;
	}
	
	public void setPrenom_Enfant(String prenom_Enfant) {
		this.prenom_Enfant = prenom_Enfant;
	}

	public void setAge_Enfant(String age_Enfant) {
		this.age_Enfant = age_Enfant;
	}
	
	public void setSex_Enfant(String sex_Enfant) {
		this.sex_Enfant = sex_Enfant;
	}
	
	public void setAllergie_Enfant(String allergie_Enfant) {
		this.allergie_Enfant = allergie_Enfant;
	}
	
	
	
	
	
	
}
