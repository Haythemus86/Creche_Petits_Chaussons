package com.gennevilliers.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemandePonctuelle implements Serializable {
	
	private String dateArrivee;
	private String dateDepart;
	private String email;
	private String telephone;
	


	public DemandePonctuelle() {
		// TODO Auto-generated constructor stub
	}
	
	
	//GETTERS
	
	public String getTelephone() {
		return telephone;
	}
	
	public String getDateArrivee() {
		return dateArrivee;
	}
	
	public String getDateDepart() {
		return dateDepart;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	//SETTERS

	

	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}



	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	
	

}
