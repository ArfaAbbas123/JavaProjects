package com.greeter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//to print data in the browser get Writer object
		PrintWriter out = response.getWriter();
		
		//get data from field
		String name = request.getParameter("employeeName");  //getParameter is retrive the value from a form
		String city = request.getParameter("city");
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		String language = request.getParameter("language");
		String []hobbies = request.getParameterValues("hobby");
		
		//bundling
		request.setAttribute("myname", name);    //("dummy name", the variable from above)
		request.setAttribute("city",city);
		request.setAttribute("employeeId",employeeId);
		request.setAttribute("salary",salary);
		request.setAttribute("language", language);
		request.setAttribute("hobbies", hobbies);
		
		//send to view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
		response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
