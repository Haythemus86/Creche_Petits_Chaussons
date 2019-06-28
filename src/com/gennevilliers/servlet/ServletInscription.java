package com.gennevilliers.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gennevilliers.beans.Enfants;
import com.gennevilliers.beans.Parents;
import com.gennevilliers.dao.DaoContext;
import com.gennevilliers.sql.AjouterParents;
import com.gennevilliers.sql.SQLEnfant;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/Inscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	

	@Override
	public void init() throws ServletException {
		DaoContext.init(getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher("/JSP/Inscription.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TEST
		System.out.println("je rentre dans doPost");
		
		
		//Test connexion bdd
		try {
			AjouterParents.TestConnexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("je suis ici 1 ");
		
		
		//stockage du formulaire concernant les parents dans un bean Parents
		Parents parent1 = new Parents();
		parent1.setNom_De_Famille(request.getParameter("nom_De_Famille"));
		parent1.setPrenom((String) request.getParameter("prenom"));
		parent1.setAdresse_Postale((String) request.getParameter("adresse_Postale"));
		parent1.setCode_Postale((String) request.getParameter("code_Postale"));
		parent1.setTelephone1((String) request.getParameter("telephone1"));
		parent1.setTelephone2((String) request.getParameter("telephone2"));
		parent1.setEmail((String) request.getParameter("email"));
		parent1.setVille(request.getParameter("ville"));
		
		//stockage du formulaire concernant les enfants dans un bean enfant
		Enfants enfant1 = new Enfants();
		enfant1.setNomDeFamille_Enfant(request.getParameter("nom_De_Famille_Enfant"));
		enfant1.setPrenom_Enfant(request.getParameter("prenom_Enfant"));
		enfant1.setSex_Enfant(request.getParameter("sex_Enfant"));
		enfant1.setAge_Enfant(request.getParameter("age_Enfant"));
		enfant1.setAllergie_Enfant(request.getParameter("allergie_Enfant"));
		
		//envoie du bean en base de donnee 
		try {
			AjouterParents.addParents(parent1);
			SQLEnfant.ajouterEnfants(enfant1);
			System.out.println("envoie du parents et de l enfant en bdd reussi");
		} catch (SQLException e) {
			System.out.println("envoie du parents a la poubelle aprends a coder");
			e.printStackTrace();
		}
		
	
		//renvoie les informations du bean vers la jsp
		request.setAttribute("parent1", parent1);
		
		this.getServletContext().getRequestDispatcher("/JSP/Inscription.jsp").forward(request, response);

	}

}
