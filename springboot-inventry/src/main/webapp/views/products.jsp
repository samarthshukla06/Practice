<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Manager</title>
<link rel="stylesheet" href="/ims/resources/static/css/style1.css">
</head>
<body>
<div align="center">
        Welcome ${dealer.fname} ${dealer.lname} - ${dealer.address.city}
        <div align="right">
            <a href="logout">Log Out <%
            out.print(request.getSession().getAttribute("user"));
            %></a>
        </div>
        <hr color="blue">
        <h1>Product List</h1>

 		<img src="/ims/resources/static/images/inventorynew.jpg" width="350px" ><br>
        <br>
        <hr color="blue">
        <a href="new">Create New Product</a> <br />
        <br />

    </div>
</body>
</html>