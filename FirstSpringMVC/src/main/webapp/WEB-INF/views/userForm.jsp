<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="${pageContext.request.contextPath }/users/add" modelAttribute="user">
		<h1>Add User</h1>
		
		Salutation : <form:input path="salutation" /><br><br>
		First Name : <form:input path="fname" /><br><br>
		Last Name : <form:input path="lname" /><br><br>
		User Name : <form:input path="uname" /><br><br>
		
 		<input type="submit" value="submit" />
	</form:form>
	</div>
</body>
</html>