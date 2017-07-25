<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MoreStore|SignUp</title>
</head>
<body>

	<form action="SignUpServlet" method="post">

		UserId:<input type="text" name="UserId" /><br> UserName:<input
			type="text" name="UserName" /><br> Password:<input
			type="password" name="Password"><br> Email:<input
			type="email" name="Email"><br> Contact:<input
			type="text" name="Contact"><br> role:<input type="text"
			name="role"> <input type="submit" value="Submit">
	</form>
</body>
</html>