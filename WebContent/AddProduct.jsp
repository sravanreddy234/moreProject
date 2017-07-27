<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <!DOCTYPE html>
<html>
<head>
<title>MoreStore|AddProduct</title>
<%-- <%@include file="AdminHeader.jsp"%> --%>
</head>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password], input[type=email] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body background="pics/nature1.jpg">
<%@include file="AdminHeader.jsp"%>
<h2>Add Product Page</h2>

<form action="AddServlet" method="POST">
  

  <div class="container">
  
  	<label><b><span class="glyphicon glyphicon-info-sign"></span>ProductId</b></label>
    <input type="text" placeholder="Enter ProductId" name="ProductId" required>
  
    <label><b><span class="glyphicon glyphicon-user">ProductName</span></b></label>
    <input type="text" placeholder="Enter ProductName" name="ProductName" required>

    <label><b><span class="glyphicon glyphicon-lock">ProductDesc</span></b></label>
    <input type="text" placeholder="Enter ProductDesc" name="ProductDesc" required>
    
    <label><b><span class="glyphicon glyphicon-envelope">Price</span></b></label>
    <input type="text" placeholder="Enter ProductPrice" name="Price" required>
    

    
   
        
    <button type="submit">Add Product</button>
    

  
    
  </div>

</form>

</body>
</html>
      
