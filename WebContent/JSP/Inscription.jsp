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
			
			
			
				<fieldset>
					
				<legend>Renseignements Enfant</legend>
				
					<label for="nom_De_Famille_Enfant">Nom de famille</label><input type="text" id="nom_De_Famille_Enfant" name="nom_De_Famille_Enfant" required="required">
					
					<label for="prenom_Enfant">Prenom</label><input type="text" id="prenom_Enfant" name="prenom_Enfant" required="required">
					
					<label for="age_Enfant">Age</label><input type="text" id="age_Enfant" name="age_Enfant" required="required"> 
						
					<label for="sex_Enfant">Sex</label><input type="text" id="sex_Enfant" name="sex_Enfant" required="required">
				
					<label for="allergie_Enfant">Allergie</label><textarea id="allergie_Enfant" name="allergie_Enfant">Veuillez preciser si l'enfant à des allergies</textarea>
					
					
				</fieldset>
			
			
				
			<input type="submit" value="soumettre le formulaire">
		
		</form>
		
		
		<br>
		<br>
		
		<c:if test="${ resultatEnvoieBdd == 0 }">affiche fenetre avertissement</c:if>
		
	
		
		
		
			
		
		
		

		
	

	</div>
</body>
</html>