<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Add Page</title>
<link rel="stylesheet" href="css/form.css">

</head>
<!-- <script>
	$(document).ready(
			function() {

				$('.table').DataTable(
						{
							"lengthMenu" : [ [ 1, 2, 3, 5, 10, -1 ],
									[ 1, 2, 3, 5, 10, "All" ] ]
						});
			});
</script> -->



<body background="pics/nature1.jpg">
	<form action="AddServlet" method="post" enctype="multipart/form-data">

		<h1 id="header">Add Products</h1>

		ProductId:<input type="text" name="ProductId"> <br>
		ProductName:<input type="text" name="ProductName"> <br>
			ProductDesc:<input type="text" name="ProductDesc"> <br>
			price:<input type="text" name="Price"> <br>
			<!-- imageUrl:<input type="file" name="imageUrl" value="Choose File"><br> --> 
			<input type="submit" value="Add Product" class="submit">

	</form>



</body>
</html>