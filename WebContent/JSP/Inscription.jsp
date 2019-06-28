<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style><%@ include file="../CSS/Inscription.css" %></style>
<title>Inscription</title>
</head>
<body>	
	<div id="bloc_page">
			<header>
			<div id="Titre_Principal">
				<h1>Formulaire d'Inscription</h1>
			</div>
			
			<nav>
				<%@ include file="MenuNavigation.jsp" %>
			</nav>
		</header>
		
		
		<form method="post" action="">
			
			<fieldset>
					
				<legend>Renseignements Parents</legend>
				
					<label for="nom_De_Famille">Nom de famille</label><input type="text" id="nom_De_Famille" name="nom_De_Famille" required="required">
					
					<label for="prenom">Prenom</label><input type="text" id="prenom" name="prenom" required="required">
					
					<label for="adresse_Postale">Adresse postale </label><input type="text" id="adresse_Postale" name="adresse_Postale" required="required"> 
						
					<label for="code_Postale">Code Postale</label><input type="text" id="code_Postale" name="code_Postale" required="required">
				
					<label for="ville">Ville</label><input type="text" id="ville" name="ville" required="required">
					
					<label for="telephone1">Téléphone 1</label><input type="tel" id="telephone1" name="telephone1" required="required">
					
					<label for="telephone2">Téléphone 2</label><input type="tel" id="telephone2" name="telephone2" required="required">
					
					<label for="email">e-mail</label><input type="email" id="email" name="email" required="required">
				
			</fieldset>		
				
			<input type="submit" value="soumettre le formulaire">
		
		</form>
		
		
		<p> votre nom est ${ parent1.nom_De_Famille } </p>
		<p> votre prenom est ${ parent1.prenom } </p>
			
		
	

	</div>
</body>
</html>