package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class MyServlets extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email =req.getParameter("email1");
		String pass=req.getParameter("pass1");
		
		PrintWriter out=resp.getWriter();
		if(email.equals("harendra@gmail.com")&&pass.equals("12345")) {
			System.out.print("sucess");
		}else {
			System.out.println("fail");
		}
	}

}
