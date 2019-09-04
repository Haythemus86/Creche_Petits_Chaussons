package com.gennevilliers.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.gennevilliers.beans.DemandePonctuelle;
import com.gennevilliers.beans.Parents;

public class Email {
	private String username = "haythem75008@gmail.com";
	private String password = "hercules86";

	public void envoyer(String email) throws MessagingException, RuntimeException {
// Etape 1 : Création de la session
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
// Etape 2 : Création de l'objet Message
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Test email");
			message.setText("Bonjour, ce message est un test ...");
// Etape 3 : Envoyer le message
			Transport.send(message);
			System.out.println("Message_envoye");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	public void envoyerRecapitulatifDemandePonctuelle(DemandePonctuelle demande)
			throws MessagingException, RuntimeException {

		// Etape 1 : Création de la session
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Etape 2 : Création de l'objet Message
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(demande.getEmail() + ",i-tem@live.fr"));
			message.setSubject("Demande de garde Ponctuelle");
			message.setContent("Bonjour,\n Voici un résumé de votre demande : <br />" 
			        + "<strong> Date d'arrivée :  "	+ demande.getDateArrivee() +"</strong> <br />" 
					+ "<strong> Date de départ : " + demande.getDateDepart() + "</strong> <br />"
					+ "Nous vous enverrons dans les plus brefs délais une réponse à votre adressse mail <strong> " + demande.getEmail() +  "</strong> <br />"
					+"Merci de votre confiance.", "text/html ; charset=UTF-8");
			// Etape 3 : Envoyer le message
			Transport.send(message);
			System.out.println("Message_envoye");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}