package com.cg;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String param1 = request.getParameter("uname"), 
				 
                 param2 = request.getParameter("pass");
		 
		 request.setAttribute("val", param1);
		 request.setAttribute("val1", param2);
		 RequestDispatcher dispatcher=request.getRequestDispatcher("/fromLoginServlet");
		 dispatcher.include(request, response);
		 
		 
		     }

		 
		 }
	


