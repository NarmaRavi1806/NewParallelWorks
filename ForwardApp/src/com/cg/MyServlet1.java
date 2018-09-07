package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet1() {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer num = Integer.parseInt(request.getParameter("num"));

		request.setAttribute("val", num);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/fromMyServlet1");
		dispatcher.forward(request, response);
		Integer result = (Integer) request.getAttribute("result");
		System.out.println("Factorial of num is ::" + result);
		response.getWriter().print(
				"<html><head></head><body>"
						+ "<center><h4> This is response from Servlet1<br>"
						+ "The Factorial of num is:" + result
						+ "</h4></center>" + "</body></html>");
	}

}
