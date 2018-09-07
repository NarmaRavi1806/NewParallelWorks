package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/ValidationServlet", "/fromLoginServlet" })
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidationServlet() {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String param1 =  (String) request.getAttribute("val");
		String param2 =  (String) request.getAttribute("val1");
		PrintWriter out=response.getWriter();

		if (param1 == null || param2 == null || "".equals(param1)
				|| "".equals(param2)) {
			out.write("<center><p id='errMsg' style='color: red;'>Please Enter Both Username & Password... !</p></center>");
			
		} else if (param1.equalsIgnoreCase("narmatha") && param2.equals("admin123")) {
			out.print("<center><p>Success</p></center>");
		} else {
			out.print("<center><p id='errMsg' style='color: red;'>Faliure</p></center>");
			
		}
		

	}

}
