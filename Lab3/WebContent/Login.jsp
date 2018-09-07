<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String username=request.getParameter("uname"); 
String password=request.getParameter("pass"); 

if((username.equalsIgnoreCase("narmatha") && password.equals("admin123"))) 
{ 
	
	session.setAttribute("username",username); 
	response.getWriter().print("<html><head></head><body style='background-color: aqua'><center><h2>Successful Login</h2></center></body></html>");
 	} 
	else
// 		throw new ServletException("Error.jsp");
 		response.sendRedirect("Error.jsp"); %>
</body>
</html>