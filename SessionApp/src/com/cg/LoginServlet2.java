package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginServlet2() {
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	if(request.getParameter("uname").trim().equalsIgnoreCase("Narmatha")
			&& request.getParameter("pass").trim().equals("admin123")){
		HttpSession session=request.getSession();
		session.setAttribute("username",request.getParameter("uname"));
		request.getRequestDispatcher("/Inbox").include(request, response);
	}else{
		response.getWriter().print("<b>Enter correct username and password!!</b><hr>");
		request.getRequestDispatcher("/LoginPage.jsp").include(request, response);
	}
	}

}
