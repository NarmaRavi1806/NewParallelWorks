package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2page3")
public class Servlet2page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet2page3() {
       
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
	
		response.getWriter().print("<html><head><meta charset='ISO-8859-1'>"
				+ "<title>Page 1</title></head><body text-align='center'>"
				+ "<form action='Servlet3' method='post'>"
				+"<input type='hidden' name='first' value='"+firstName+"'/>"
				+"<input type='hidden' name='last' value='"+lastName+"'/>"
				+"<input type='hidden' name='mobile' value='"+mobile+"'/>"
				+"<input type='hidden' name='email' value='"+email+"'/>"
				+"<input type='hidden' name='gender' value='"+gender+"'/>"
				+ "Country : <input type='text' name='country'/><br>"
				+ "State : <input type='text' name='state'/><br>"
				+ "<input type='submit' value='continue'/><br>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
	
	}

}
