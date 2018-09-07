package com.cg;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Inbox() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		session.getCreationTime();
		
		if(session!=null){
			response.getWriter().print("<html><head></head><body><div style='background-color:magenta;color:blue'>"
					+ "<b>Welcome "+ session.getAttribute("username")+"</b><hr>"
					+ "Login Time : "+LocalDateTime.now() +"<br>"
					+ "<form action='SentItems' method='post'>"
					+ "<input type='submit' value='sent items'/>"
					+ "</form></div><br><br>"
					+ "<div style='background-color:lightgreen;'>"
					+ "<form action='Logout' method='post'>"
					+ "<input type='submit' value='Signout'/>"
					+ "</form></div>"
					+ "</body></html>");
		}else{
			response.getWriter().print("<b>Invalid Login!!</b><hr>");
			request.getRequestDispatcher("/LoginPage.jsp").include(request, response);
		}
	}

}
