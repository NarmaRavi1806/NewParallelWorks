package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1page2")
public class Servlet1page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet1page2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName= request.getParameter("first");
		String lastName= request.getParameter("last");
		String mobile= request.getParameter("mobile");
		response.getWriter().print("<html><head><meta charset='ISO-8859-1'>"
				+ "<title>Page 2</title></head><body text-align='center'>"
				+ "<form action='Servlet2page3' method='post'>"
				+"<input type='hidden' name='first' value='"+firstName+"'/>"
				+"<input type='hidden' name='last' value='"+lastName+"'/>"
				+"<input type='hidden' name='mobile' value='"+mobile+"'/>"
				+ "Email : <input type='text' name='email'/><br>"
				+ "Gender : <input type='text' name='gender'/><br>"
				+ "<input type='submit' value='continue'/><br>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
	}

}
