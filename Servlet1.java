package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		writer.println("Welcome "+userid);
		writer.println("<br>");
		ServletConfig config = getServletConfig();
		/*String bookname = config.getInitParameter("BookName");
		writer.println("Book Name : "+bookname);*/
		
		String string ="";
		Enumeration<String> enumeration = config.getInitParameterNames();
		while(enumeration.hasMoreElements())
		{
			string = enumeration.nextElement();
			writer.println("The Name of Parameter : "+string);
			writer.println("<br>");
			writer.println("Value of Parameter : "+config.getInitParameter(string));
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
