<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MoreStore|SignUp</title>
<link rel="stylesheet" href="css/form.css">
</head>
<body>

	<form action="SignUpServlet" method="post">

		<input type="text" name="UserId" placeholder="Enter UserId" /><br> UserName:<input
			type="text" name="UserName" placeholder="Enter UserName"/><br> Password:<input
			type="password" name="Password" placeholder="Enter Password"><br> Email:<input
			type="email" name="Email"placeholder="Enter EmailId"><br> Contact:<input
			type="text" name="Contact" placeholder="Enter Contact"><br> role:<input type="text"
			name="role"> <input type="submit" value="Submit">
	</form>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <!DOCTYPE html>
<html>
<head>
<title>MoreStore|SignUp</title>
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
<body>

<h2>Registration Form</h2>

<form action="SignUpServlet" method="POST">
  

  <div class="container">
  
  	<label><b><span class="glyphicon glyphicon-info-sign">UserId</b></label>
    <input type="text" placeholder="Enter UserId" name="UserId" required>
  
    <label><b><span class="glyphicon glyphicon-user">Username</span></b></label>
    <input type="text" placeholder="Enter Username" name="UserName" required>

    <label><b><span class="glyphicon glyphicon-lock">Password</span></b></label>
    <input type="password" placeholder="Enter Password" name="Password" required>
    
    <label><b><span class="glyphicon glyphicon-envelope">Email</span></b></label>
    <input type="email" placeholder="Enter EmailId" name="Email" required>
    
    <label><b><span class="glyphicon glyphicon-earphone">Contact</span></b></label>
    <input type="text" placeholder="Enter Contact number" name="Contact" required>
    
   
        
    <button type="submit">SignUp</button>
    

  
    
  </div>

</form>

</body>
</html>
      
