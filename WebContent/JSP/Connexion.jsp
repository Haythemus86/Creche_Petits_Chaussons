<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style><%@ include file="../CSS/Accueil.css" %></style>
<title>Connexion</title>
</head>
<body>
	<div id="bloc_page">
		<header>
			<div id="Titre_Principal">
				<h1>Connexion</h1>
			</div>
			
			<nav>
				<%@ include file="MenuNavigation.jsp" %>
			</nav>
		</header>
		
		<form method="post" action="">
			
			<fieldset>
					
				<legend>Identification :</legend>
				
					<label for="login">Login</label><input type="text" id="login" name="login" required="required">
					
					<label for="motDePasse">Mot de passe </label><input type="password" id="motDePasse" name="motDePasse" required="required">
				
			</fieldset>				
			<input type="submit" value="Valider">
		
		</form>
			
	

		<footer>
		</footer>


	</div>
</body>
</html>