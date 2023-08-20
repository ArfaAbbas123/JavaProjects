<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<%-- <%String name = "Arfa";%>
<h2>Welcome  <%= name %></h2>
<% int x=10,y=20;%>
<%= "Sum"+(x+y) %>

<% int counter=1; %>
You are user no <%= counter++ %>
String greet(){
	return "greet";
<%!String greet(){
		return "Great Day";
	}
%> --%>
</body>
</html>