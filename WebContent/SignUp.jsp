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
<body background="pics/nature1.jpg">

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
      
