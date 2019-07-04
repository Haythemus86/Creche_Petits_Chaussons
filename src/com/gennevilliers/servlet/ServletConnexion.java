package com.gennevilliers.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gennevilliers.beans.Identification;
import com.gennevilliers.sql.VerifierIdentifiant;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/Connexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Creation de l objet contenant login et mdp
		Identification user1 = new Identification();
		user1.setLogin(request.getParameter("login"));
		user1.setPassword(request.getParameter("motDePasse"));
		
		//test
		System.out.println("id recup = " + user1.getLogin() + "mdp : " + user1.getPassword());
		
		
	  VerifierIdentifiant verif = new VerifierIdentifiant();
	  try {
		verif.verifierId(user1);
		System.out.println("je suis ici");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		this.getServletContext().getRequestDispatcher("/JSP/Connexion.jsp").forward(request, response);
	}

}
