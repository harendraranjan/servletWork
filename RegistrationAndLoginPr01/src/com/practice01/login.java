package com.practice01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;

@WebServlet("/login")
public class login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			PreparedStatement ps=con.prepareStatement("SELECT * FROM registration WHERE email=? AND password=?");
			ps.setString(1, myemail);
			ps.setString(2, mypass);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				HttpSession session=req.getSession();
				session.setAttribute("kye_name",rs.getString("name"));
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}else {
				out.print("<h3 style='color:red'>!You are inter Wrong password or ID</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
			}
		}catch(Exception e) {
			e.getStackTrace();
			out.print("<h3 style='color:red'>!error"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
	
	}
}

