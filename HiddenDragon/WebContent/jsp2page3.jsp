<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String firstName= request.getParameter("first");
String lastName= request.getParameter("last");
String mobile= request.getParameter("mobile");
String email= request.getParameter("email");
String gender= request.getParameter("gender");

response.getWriter().print("<html><head><meta charset='ISO-8859-1'>"
		+ "<title>Page 1</title></head><body text-align='center'>"
		+ "<center><form action='jsp3page4.jsp' method='post'>"
		+"<input type='hidden' name='first' value='"+firstName+"'/>"
		+"<input type='hidden' name='last' value='"+lastName+"'/>"
		+"<input type='hidden' name='mobile' value='"+mobile+"'/>"
		+"<input type='hidden' name='email' value='"+email+"'/>"
		+"<input type='hidden' name='gender' value='"+gender+"'/>"
		+ "Country : <input type='text' name='country'/><br>"
		+ "State : <input type='text' name='state'/><br>"
		+ "<input type='submit' value='continue'/><br>"
		+ "</form></center>"
		+ "</body>"
		+ "</html>"); %>
</body>
</html>