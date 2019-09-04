<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
		
			<label for="dateGardeEnfantArrivee">Selectionner la date et l'heure d'arrivée</label><input type="datetime-local" id="dateGardeEnfantArrivee" name="dateGardeEnfantArrivee" min="" required="required">
			
			<label for="dateGardeEnfantDepart">Selectionner la date et l'heure de départ</label><input type="datetime-local" id="dateGardeEnfantDepart" name="dateGardeEnfantDepart" min="" required="required"> 
	
			<label for="email">e-mail</label><input type="email" id="email" name="email" value="adresse mail" required="required">
			
		
		<input type="submit" value="Envoyer" class="btn btn-success" >
		
		
		</form>
		
		<c:if test="${ reussi == true }">
			<script type="text/javascript">
			alert("Votre demande a été rpise en compte.");
			 window.location = "/Creche_Petits_Chaussons/";
			
			</script>
		</c:if>
		
		<script type="text/javascript">	
	 	(function() {
	 		 		
	 		
	 		var dateActuel = new Date();

	 		var datestring = dateActuel.getFullYear() + "-" + ("0"+(dateActuel.getMonth()+1)).slice(-2) + "-" + ("0" + dateActuel.getDate()).slice(-2) + "T"+ ("0" + dateActuel.getHours()).slice(-2) + ":" + ("0" + dateActuel.getMinutes()).slice(-2);
	 		
	 	 		
			var dateArrivee = document.getElementById("dateGardeEnfantArrivee");
			var dateDepart = document.getElementById("dateGardeEnfantDepart");
			console.log("date du jour " + datestring );
			
			dateArrivee.setAttribute("min" , datestring);
			dateDepart.setAttribute("min", datestring );
	 		
	 	})()
		</script>
		
		
		  	
		
		</section>

		<footer>
		</footer>


	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>