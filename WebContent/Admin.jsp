<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MoreStore|AdminPage</title>
</head>
<body>
<h1>Welcome Admin</h1>
<form action="Home.html" method="post">
		<input type="submit" value="Logout">
	</form>
<form action="ViewServlet" method="Get">
	<input type="submit" value="viewProducts">
</form>
<!-- <a href="AddProduct.html"><button type="button" class="btn btn-primary">Add Products</button></a> &nbsp; &nbsp;
	<a href="DeleteProduct.html"><button type="button" class="btn btn-success">Delete Products</button></a> &nbsp; &nbsp;
	<a href="EditProduct.html"><button type="button" class="btn btn-warning">Edit Products</button></a> -->
	
	<a href="AddProduct.html"><input type="button" class="btn btn-primary">Add Products</a> &nbsp; &nbsp;
	<a href="DeleteServlet"><input type="button" class="btn btn-success">Delete Products</a> &nbsp; &nbsp;
	<a href="EditProduct.html"><input type="button" class="btn btn-warning">Edit Products</a>


</body>
</html>