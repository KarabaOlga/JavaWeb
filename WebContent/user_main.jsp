<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	
	<c:forEach items="${books}" var="i">
		<h1>The last added books are:</h1>
		<br>
			<span>Book</span>
			<h3>title: </h3> <c:out value="${i.getTitle()}" />
		<br>
	</c:forEach>
</body>
</html>   