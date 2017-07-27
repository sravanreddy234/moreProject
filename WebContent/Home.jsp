<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>MoreStore|HOME</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body style="height:1500px" background="pics/nature1.jpg">

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
  
  <a class="navbar-brand" href="Home.jsp">
    <img src="pics/more2.png" width="30" height="30" alt="">
  </a>
<div class="navbar-header">
    
      <a class="navbar-brand" href="Home.jsp">MoreStore</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
      <li><a href="AboutUs.jsp">AboutUs</a></li>
      <li><a href="Address.jsp">Address</a></li>
      <li><a href="ContactUs.jsp">ContactUs</a></li>
    </ul>
    
    
    <a href="SignUp.jsp" style="float:right"><button class="btn btn-danger navbar-btn">SignUp</button></a>
    <a href="Login.jsp" style="float:right"><button class="btn btn-info navbar-btn">Login</button></a>
 
 <%-- <%
 	String uid =request.getParameter((String) session.getAttribute("UserId"));        
        //redirect user to login page if not logged in
        if(uid==null){
            response.sendRedirect("Home.jsp");
        }
        %>
    
        <p>Welcome <%=uid%></p>    
        <a href="LogoutServlet">Logout</a> --%>
 
  </div>
  
</nav>
		<jsp:include page="Footer.jsp"></jsp:include>
  </body>
  
  
</html>
