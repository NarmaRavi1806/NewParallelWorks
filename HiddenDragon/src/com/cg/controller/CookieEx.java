package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieEx")
public class CookieEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CookieEx() {

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("JavaPoint", "Code Question Bank,Answers");
		Cookie cookie2 = new Cookie("FullStack", "June 13 JEE Batch");
		cookie1.setDomain("java");
		cookie1.setMaxAge(50000);
		cookie1.setVersion(1);
		cookie2.setDomain("capg");
		cookie2.setMaxAge(50000);
		cookie2.setVersion(1);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
