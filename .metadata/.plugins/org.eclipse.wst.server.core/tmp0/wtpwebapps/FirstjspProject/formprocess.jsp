<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello from success</h1>
<% 

String name=request.getParameter("username");
// System.out.println(12/0);
%>
<%session.setAttribute("name", name); %>



<a href="secondpage.jsp"> secondpage</a>
Welcome <%= name %>
</body>
</html>