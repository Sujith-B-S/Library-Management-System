<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<style>
	body {
		margin: 0;
		padding: 0;
		font-family: sans-serif;
		background-color: rgb(199, 206, 206);
	}

	h1 {
		text-align: center;
		margin-top: 20px;
	}

	.container {
		background-color: white;
		width: 30%;
		padding: 40px;
		margin: 50px auto;
		border: 1px solid black;
		border-radius: 20px;
		box-shadow: 10px 10px 5px grey;
	}

	.login-form {
		display: flex;
		flex-direction: column;
		align-items: center; /* Centers the content horizontally */
	}

	.inp {
		width: 100%; /* Full width input */
		padding: 10px;
		margin-bottom: 20px;
		border: 1px solid slategrey;
		border-radius: 10px;
		font-size: 18px;
		background-color: azure;
	}

	.inp:focus {
		border-color: aqua;
		outline: none;
		box-shadow: 0 0 8px rgba(0, 123, 255, 0.5);
	}

	.sub {
		padding: 10px;
		font-size: 16px;
		font-weight: 400;
		background-color: black;
		color: rgb(255, 252, 252);
		border: none;
		border-radius: 15px;
		width: 120px; /* Fixed button width */
		cursor: pointer;
		text-align: center;
	}

	.sub:hover {
		background-color: #333; /* Slight hover effect */
	}

	.register-link {
		margin-top: 15px;
		font-size: 14px;
		text-decoration: none;
		color: blue;
	}

	.register-link:hover {
		text-decoration: underline;
	}
</style>
<body>
	<h1>Admin Login</h1>
	<div class="container">
		<form action="Login" class="login-form">
			<input type="email" name="email" required="required" placeholder="Email" class="inp">
			<input type="password" name="pwd" required="required" placeholder="Password" class="inp">
			<input type="submit" value="Login" class="sub">
			<a href="Register.jsp" class="register-link">Register here</a>
		</form>
	</div>
</body>
</html>
