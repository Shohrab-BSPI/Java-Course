<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	    <title>Hello All</title>
	</head>
	<body>
	<div align="center">
		<h1>Hello Guys</h1>
		<c:forEach items = "${names}" var = "assignname">
			<h2>${assignname}</h2>
			
			<c:if test="${assignname == 'Abdullah Wasse'}">
				<h3>My surname Name Abdullah</h3>
			</c:if>
			
			<c:choose>
				<c:when test="${assignname=='Md. Shohrab'}">
					<p>My Name is "Md. Shohrab Hossain"</p>
				</c:when>
				
				<c:otherwise>
					<p>I don't know this guy</p>
				</c:otherwise>	
			</c:choose>
			
			
		</c:forEach>
		</div>
	</body>
</html>