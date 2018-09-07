package com.cg;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SentItems")
public class SentItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SentItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if(session!=null){
			response.getWriter().print("<html><head></head><body><div style='background-color:magenta;color:blue'>"
					+ "<b>Welcome "+ session.getAttribute("username")+"</b><hr>"
					+ "Login Time : "+LocalDateTime.now() +"<br>"
					+ "<form action='Inbox' method='post'>"
					+ "<input type='submit' value='Inbox'/>"
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
