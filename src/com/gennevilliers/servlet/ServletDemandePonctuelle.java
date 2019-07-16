package com.gennevilliers.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gennevilliers.beans.DemandePonctuelle;
import com.gennevilliers.mail.Email;
import com.gennevilliers.sql.DemandePonctuelleSQL;

/**
 * Servlet implementation class ServletDemandePonctuelle
 */
@WebServlet("/DemandePonctuelle")
public class ServletDemandePonctuelle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean reussi;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemandePonctuelle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/JSP/DemandePonctuelle.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DemandePonctuelle demande1 = new DemandePonctuelle();
		
		//recuperation des donnes du formulaire et passage dans le bean
		 demande1.setDateArrivee( request.getParameter("dateGardeEnfantArrivee"));
		 demande1.setDateDepart(request.getParameter("dateGardeEnfantDepart"));
		 demande1.setEmail(request.getParameter("email"));
		 
		 //Test heure qui bug-- a la sortie du formulaire
		 System.out.println("sortie formulaire ::::heure d arrivee " +request.getParameter("dateGardeEnfantArrivee"));
		 System.out.println("sortie formulaire ::::heure depart " + request.getParameter("dateGardeEnfantDepart"));
		 System.out.println(request.getParameter("dateGardeEnfantArrivee").getClass().getTypeName());
	
		 
		 //envoie des dates en bdd
		 DemandePonctuelleSQL demandePonctuelleSQL = new DemandePonctuelleSQL();
		 try {
			demandePonctuelleSQL.enregistrerDemandeEnBdd(demande1);
			reussi = true;
			request.setAttribute("reussi", this.reussi);
			Email email = new Email();
			email.envoyerRecapitulatifDemandePonctuelle(demande1);
		} catch (SQLException e) {
			reussi = false;
			request.setAttribute("reussi", this.reussi);
			System.out.println("probleme de saisi de date");
			e.printStackTrace();
		} catch (MessagingException e) {
			System.out.println("erreur message");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("erreur runtime");
			e.printStackTrace();
		}
		 
		
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/JSP/DemandePonctuelle.jsp").forward(request, response);

	}

}
