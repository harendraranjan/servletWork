package com.practice01;

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

@WebServlet("/Registration")
public class registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		String mycity=req.getParameter("city1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO registration VALUE (?,?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mygender);
			ps.setString(5, mycity);
			int count=ps.executeUpdate();
			if(count>0) {
				out.print("<h3 style='color:green'>Your registratin has been done sussesfully</h3><");
				RequestDispatcher rd=req.getRequestDispatcher("/registration.jsp");
				rd.include(req, resp);
			}else {
				out.print("<h3 style='color:green'>Your registratin has been done fail</h3><");
				RequestDispatcher rd=req.getRequestDispatcher("/registration.jsp");
				rd.include(req, resp);
			}
		}catch (Exception e ){
			e.getStackTrace();
			out.print("<h3 style='color:green'>Your registratin has been due to"+e.getMessage()+"</h3><");
			RequestDispatcher rd=req.getRequestDispatcher("/registration.jsp");
			rd.include(req, resp);
		}
		 
	}

}
