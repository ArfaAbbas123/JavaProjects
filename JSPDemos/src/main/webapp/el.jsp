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
request.setAttribute("message", "Good Day in request");
session.setAttribute("newmessage", "Good Day in session");
request.setAttribute("appmessage", "Fun day in Application");
%>
<h2>using Scripting</h2>
<%
String msg1=(String)request.getAttribute("message");
String msg2=(String)request.getAttribute("message"); //httpSession
String msg3=(String)request.getAttribute("message"); //Servlet Confid
%>
<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>

<h2>Using el</h2>
${requestScope.message }
${sessionScope.message }
${applicationrequestScope.message }
</body>
</html>