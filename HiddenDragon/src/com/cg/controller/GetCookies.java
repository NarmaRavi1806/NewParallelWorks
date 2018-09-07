package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookies")
public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetCookies() {
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie[]=request.getCookies();
		PrintWriter out=response.getWriter();
		out.print("<html><body><pre><b>");
		for (Cookie c : cookie) {
			out.print(c.getName()+" "+c.getPath()+" "+c.getDomain()+" "+c.getMaxAge()+" "+c.getVersion()+"<br>");
		}
		out.print("</html></body></pre></b>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
