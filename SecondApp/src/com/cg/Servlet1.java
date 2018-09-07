package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer num=Integer.parseInt(request.getParameter("num"));
		System.out.println("In Servlet1 num::"+num);
		Integer newNum=num+5;
		
		request.setAttribute("val", newNum);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/fromServlet1");
		//dispatcher.include(request, response);
		dispatcher.forward(request, response);
		Integer result=(Integer) request.getAttribute("result");
		System.out.println("about response"+result);
		response.getWriter().print("<html><head></head><body>"
				+"<center><h4> This is response from Servlet1<br>"
				+ "The result is:"+result+"</h4></center>"
						+ "</body></html>");
	}

}
