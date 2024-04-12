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
		String Myname=req.getParameter("name1");
		String MyEmail=req.getParameter("email1");
		
		PrintWriter out=resp.getWriter();
		out.println("Your Name  :"+Myname);
		out.println("Your Email  :"+MyEmail);
		
	}

}
