<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	
	<%
	String name = (String) request.getAttribute("name");
	String email = (String) request.getAttribute("email");
	String phone = (String) request.getAttribute("phone");
	List<String> courses = (List<String>) request.getAttribute("courses");
	%>

	<h1>Welcome Home Page</h1>
	
	<h3>Name : <%=name %> </h3>
	<h3>Email : <%=email %> </h3>
	<h3>Phone : <%=phone %> </h3>
	
	<%
		for(String s : courses){
			%>
			<h4> <%= s %> </h4>
			<%
		}
	%>
	 --%>
	 
	 
	 <h1>Welcome Home Page</h1>
	
	<h3>Name : ${name } </h3>
	<h3>Email : ${email } </h3>
	<h3>Phone : ${phone } </h3>
	
	<c:forEach items="${courses}" var="cou">
		<h3>${cou}</h3>
	</c:forEach>
	 
	 
	<a href="login">Login</a>
</body>
</html>