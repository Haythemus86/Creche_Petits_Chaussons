package com.gennevilliers.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemandePonctuelle implements Serializable {
	
	private String dateArrivee;
	private String dateDepart;
	
	public DemandePonctuelle() {
		// TODO Auto-generated constructor stub
	}

	public String getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}
	
	
	public LocalDateTime conversionDateArrivee ( DemandePonctuelle demandePonctuelle) {
		
		String supprimerT = demandePonctuelle.getDateDepart().replaceAll("[T]"," ");
		
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
	
	LocalDateTime dateArriveeConvertie = LocalDateTime.parse(supprimerT, formatter);
	
	return dateArriveeConvertie;
		
		
	}
	
	public LocalDateTime conversionDateDepart (DemandePonctuelle demandePonctuelle) {
		
		
		String supprimerT = demandePonctuelle.getDateArrivee().replaceAll("[T]"," ");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		LocalDateTime dateArriveConvertie = LocalDateTime.parse(supprimerT, formatter);
		
		return dateArriveConvertie;
		
		
	}
	
  
	

}
