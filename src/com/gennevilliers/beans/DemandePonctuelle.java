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
	
	

}
