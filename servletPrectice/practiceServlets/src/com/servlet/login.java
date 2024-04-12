package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/profile")
public class login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Myemail=req.getParameter("email1");
		String pass=req.getParameter("pass");
		PrintWriter out=resp.getWriter();
		if(Myemail.equals("harendra@gmail.com")&&pass.equals("12345")){
			HttpSession session=req.getSession();
			session.setAttribute("key", "Harndra ranjan");
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
			
		}else{
			out.print("<h2 style='color:red'>Enter worng email id or password<h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			
		}
	}

}
