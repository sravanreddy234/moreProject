<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MoreStore|login</title>
</head>
<body>
<body>
	<h1>Your in Login page</h1>
	<form action="LoginServlet" method="post">
		UserId:<input type="text" name="UserId"> Password:<input
			type="password" name="Password"> <input type="submit"
			value="Login">
	</form>
</body>
</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>MoreStore|Login</title>
  
  
  
      <link rel="stylesheet" href="css/login.css">

  
</head>

<body background="pics/nature1.jpg">
  <div class="wrapper">
	<div class="container">
		<h1>Hello!!!</h1>
		
		<form action="LoginServlet" method="post">
		<input type="text" name="UserId" placeholder="UserId">
		<input type="password" name="Password" placeholder="Password"> 
		<button type="submit" value="Login" id="login-button">Login</button>
	</form>
		
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
  

    <script src="js/index.js"></script>

</body>
</html>
