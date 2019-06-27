package com.gennevilliers.dao;

import javax.servlet.ServletContext;

public class DaoContext  {
	
	
	protected static String dbURL;
	protected static String dbLogin;
	protected static String dbPassword;
	
	
	public static void init(ServletContext context) {
		
		try {
			Class.forName(context.getInitParameter("JDBC DRIVER"));
			
			
			dbURL = context.getInitParameter("JDBC URL") + "?useTimezone=true&serverTimezone=UTC";
			dbLogin = context.getInitParameter("JDBC LOGIN");
			dbPassword = context.getInitParameter("JDBC PASSWORD");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("le driver n a pas ete trouver");
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
