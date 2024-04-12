package com.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		String mycity=req.getParameter("city1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false", "root", "root");
	        PreparedStatement ps = con.prepareStatement("INSERT INTO registration (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mygender);
			ps.setString(5, mycity);
			int cont=ps.executeUpdate();
			if(cont>0) {
				resp.setContentType("text/html");
				out.println("<h2 style='color:green'>susses full enter</h2>");
				RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
				rd.include(req, resp);
			}else {
				resp.setContentType("text/html"); 
				out.println("<h2 style='color:green'>fail due to somse tecnical ression</h2>");
				RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
				rd.include(req, resp);
			}
		}catch(Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html"); 
			out.println("fail due to :"+e.getMessage());
			RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
			rd.include(req, resp);
		}
	}
}
