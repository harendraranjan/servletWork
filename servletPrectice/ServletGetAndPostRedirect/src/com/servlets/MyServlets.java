package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class MyServlets extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail=req.getParameter("email1");
		String pass=req.getParameter("password");
		PrintWriter out= resp.getWriter();
		
		if(myemail.equals("harendra@gmail.com")&&pass.equals("12345")) {
			
			//req.setAttribute("Name_key", "Harendra Ranjan");
			
			HttpSession session=req.getSession();
			session.setAttribute("Name_key", "Harendra Ranjan");
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}else{
			
			out.println("<h3 style='color :red'>Enter worng email or password</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);//if we use forward then it not print the massage on brouser
		}
	}
}
