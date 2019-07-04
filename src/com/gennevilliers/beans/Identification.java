package com.gennevilliers.beans;

import java.io.Serializable;

public class Identification implements Serializable{
	
	private String login;
	private String password;
	
	public Identification() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getLogin() {
		return login;
	}
	
	
	
	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
