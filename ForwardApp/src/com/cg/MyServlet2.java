package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/MyServlet2", "/fromMyServlet1" })
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet2() {
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hi From Servlet2");

		Integer number = (Integer) request.getAttribute("val");

		// Integer fact = number*(number-1);
		request.setAttribute("result", fact1(number));

		System.out.println("Bye From Servlet2");
		response.getWriter().print(
				"<html><head></head><body>"
						+ "<center><h4> Response from Servlet2<br>"
						+ "</h4></center><hr>" + "</body></html>");
	}

	int fact1(int a) {
		if (a <= 1)
			return 1;
		else {
			a = a * fact1(a - 1);
			return a;
		}
	}
}
