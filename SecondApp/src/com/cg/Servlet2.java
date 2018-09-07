package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Servlet2", "/fromServlet1" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet2() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hi From Servlet2");
		
		Integer valFromServlet1=(Integer) request.getAttribute("val");
		Integer result = valFromServlet1*valFromServlet1;
		request.setAttribute("result", result);
		
		System.out.println("Bye From Servlet2");
		response.getWriter().print("<html><head></head><body>"
				+"<center><h4> Response from Servlet2<br>"
				+ "</h4></center><hr>"
						+ "</body></html>");
	}

}
