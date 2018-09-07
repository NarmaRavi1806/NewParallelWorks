package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.beans.NumberBean;
import com.cg.service.IService;
import com.cg.service.ServiceImpl;


@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   IService service=null;   
   
	
    public AddController() {
    	service=new ServiceImpl(); 
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer num1=Integer.parseInt(request.getParameter("num1"));
		Integer num2=Integer.parseInt(request.getParameter("num2"));
		NumberBean numberBean = new NumberBean();
		numberBean.setNumber1(num1);
		numberBean.setNumber2(num2);
		try{
		Integer result=service.addNumber(numberBean);
		System.out.println(result);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><head><title>Add Number</title></head>"
				+ "<body>Addition of "+num1+" and "+num2+" is : "
						+result+"</body></html>");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
