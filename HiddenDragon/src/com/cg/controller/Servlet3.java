package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName= request.getParameter("first");
		String lastName= request.getParameter("last");
		String mobile= request.getParameter("mobile");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String country= request.getParameter("country");
		String state= request.getParameter("state");
		response.getWriter().print("<html><head><meta charset='ISO-8859-1'>"
				+ "<title>Page 4</title></head>"
				+ "<body text-align='center'>"
				+"FirstName : "+firstName+"<br>"
				+"LastName : "+lastName+"<br>"
				+"Mobile : "+mobile+"<br>"
				+"Email Id : "+email+"<br>"
				+"Gender : "+gender+"<br>"
				+"Country : "+country+"<br>"
				+"State : "+state+"<br>"
				+ "</body>"
				+ "</html>");
		System.out.println(firstName+" "+lastName+" "+mobile+" "+email+" "+gender+" "
				+country+" "+state);
	}

}
