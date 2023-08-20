<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String)request.getAttribute("myname");   //getAttribute is to retrive the value from a selvet
	out.print("WELCOME"+name+"<br>");
	String city = (String)request.getAttribute("city");
	out.print("CITY"+city+"<br>");
	
	Integer employeeId = (Integer)request.getAttribute("employeeId");
	out.print("EmployeeId"+employeeId+"<br>");
	Double salary = (Double)request.getAttribute("salary");
	out.print("SALARY"+salary+"<br>");
	String language = (String)request.getAttribute("language");
	out.print("LANGUAGE"+language+"<br>");
	String[] hobbies = (String[])request.getAttribute("hobbies");
	if(hobbies!=null)
		for(String hobby:hobbies)
			out.print("HOBBIES"+hobby+"<br>");
	

%>
</body>
</html>