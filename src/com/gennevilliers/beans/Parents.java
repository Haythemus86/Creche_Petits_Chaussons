package com.gennevilliers.beans;

import java.io.Serializable;

public class Parents implements Serializable {
	
	
	//ATTRIBUTS
	
	private String nom_De_Famille ;
	private String prenom;
	private String adresse_Postale;
	private String code_Postale;
	private String ville;
	private String telephone1;
	private String telephone2;
	private String email;
	
	
	
	
	/**
	 * Constructeur par defaut
	 */
	public Parents() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//GETTERS
	
	
	public String getNom_De_Famille() {
		return nom_De_Famille;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getAdresse_Postale() {
		return adresse_Postale;
	}
	
	public String getCode_Postale() {
		return code_Postale;
	}
	
	public String getTelephone1() {
		return telephone1;
	}
	
	public String getTelephone2() {
		return telephone2;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getVille() {
		return ville;
	}

	
	
	
	//SETTERS
	
	public void setNom_De_Famille(String nom_De_Famille) {
		this.nom_De_Famille = nom_De_Famille;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse_Postale(String adresse_Postale) {
		this.adresse_Postale = adresse_Postale;
	}
	
	public void setCode_Postale(String code_Postale) {
		this.code_Postale = code_Postale;
	}
	
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	
	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}

	
	
	

}
