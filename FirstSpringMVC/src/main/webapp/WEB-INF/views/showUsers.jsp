<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	    <title>Hello All</title>
	</head>
	<body>
	<div align="center">
		<h1>Your All Info !!</h1>
		<c:forEach items = "${users}" var = "user">
		
			<h3>Name : ${user.salutation} ${user.fname} ${user.lname} </h3>
			<h3>User Name : ${user.uname}</h3>
		= = = = = = = = = = = = = = = = = = = = = = = = =
		</c:forEach>
		</div>
	</body>
</html>