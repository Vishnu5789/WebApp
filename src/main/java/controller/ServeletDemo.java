package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServeletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init()
	{
		System.out.print("Init method called");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String que=request.getParameter("qualification");
		RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		rd.include(request, response);
		response.getWriter().append("Served at: ").append("welcome to my servlet, "+name+" "+que);
//		response.sendRedirect("SecondServlet");
	
	}
	public void destroy()
	{
		System.out.print("Destroy method called");

	}
	

}
