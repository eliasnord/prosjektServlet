<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrering</title>
</head>
<body>

	<h2>Registrer deg her</h2>
		<form action ="Registrer" method="post" class="pure-form pure-form-aligned">
		<div class="container">
		
		<p>Fyll inn detaljer for å opprette bruker</p>

			<hr>
			<label for="email"><b>Email</b></label>
			<input type="text" placeholder="Email" name="email">
			<label for="pwd"><b>Password</b></label>
			<input type="password" placeholder="Password" name="password">
			<label for="confirm"><b>Bekreft passord</b></label>
			<input type="password" placeholder="Bekreft Passord" name="confirm">
			<hr>
 
			<button type="submit" class="registerbtn"><strong>Register</strong></button>
		</div>

		</form>
	</body>
</html>