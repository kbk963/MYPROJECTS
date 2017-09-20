package com.students.details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.api.mysqla.result.Resultset;


/**
 * Servlet implementation class Action
 */
@WebServlet(urlPatterns= {"/Actionpath"})
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection c;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/circle","root","root");
			
			if(request.getParameter("method").equals("Get All"))
			{
			Statement myst=c.createStatement();
			 
		ResultSet myrs=myst.executeQuery("select * from details");
				while(myrs.next())
				{
					PrintWriter p=response.getWriter();
					p.println("<h1>"+myrs.getString("Id")+" "+myrs.getString("firstName")+"  "+myrs.getString("lastName")+"  "+myrs.getString("region")+"</h1>");	
				}
				c.close();
			}
			
			if(request.getParameter("method").equals("Delete"))
			{
				String sql2="delete from details where Id=?";
				PreparedStatement myst=c.prepareStatement(sql2);
				 myst.setInt(1, Integer.parseInt(request.getParameter("id")));
					myst.execute();
					c.close();	
			
			
			PrintWriter p=response.getWriter();
			p.println("Data deleted sucessfully");
			}
			
			
			if(request.getParameter("method").equals("Update"))
			{
				String sql1="Update details set firstName=?,lastName=?,region=? where Id=?";
				PreparedStatement myst=c.prepareStatement(sql1);
				 myst.setString(1,request.getParameter("firstName"));
				 myst.setString(2,request.getParameter("lastName"));
				 myst.setString(3,request.getParameter("region"));
				 myst.setInt(4, Integer.parseInt(request.getParameter("id")));
					myst.execute();
					c.close();
			PrintWriter p=response.getWriter();
			p.println("Data updated sucessfully");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	Connection c;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","root");
		
		
		
			String sql="insert into details"+"(Id,firstName,lastName,region)"+"values(?,?,?,?)";
			PreparedStatement myst=c.prepareStatement(sql);
			 myst.setString(2,request.getParameter("firstName"));
			 myst.setString(3,request.getParameter("lastName"));
			 myst.setString(4,request.getParameter("region"));
			 myst.setInt(1, Integer.parseInt(request.getParameter("id")));
				myst.execute();
			c.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	PrintWriter p=response.getWriter();
	p.println("Data inserted sucessfully");
	}
  	
	

	
	

}
