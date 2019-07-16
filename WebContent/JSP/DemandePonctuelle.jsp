<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style><%@ include file="../CSS/DemandePonctuelle.css" %></style>
<title>Demande Ponctuelle</title>
</head>
<body>
	<div id="bloc_page">
		<header>
			<div id="Titre_Principal">
				<h1>Demande Ponctuelle</h1>
			</div>
			
			<nav>
				<%@ include file="MenuNavigation.jsp" %>
			</nav>
			

			
			
		</header>
		
		
		<section>
		
		<form method="post">
		
			<label for="dateGardeEnfantArrivee">Selectionner la date et l'heure d'arrivée</label><input type="datetime-local" id="dateGardeEnfantArrivee" name="dateGardeEnfantArrivee" required="required">
			
			<label for="dateGardeEnfantDepart">Selectionner la date et l'heure de départ</label><input type="datetime-local" id="dateGardeEnfantDepart" name="dateGardeEnfantDepart" required="required"> 
		
		
		<input type="submit" value="Envoyer" >
		
		
		</form>
		
		
		  	
		
		</section>

		<footer>
		</footer>


	</div>
</body>
</html>