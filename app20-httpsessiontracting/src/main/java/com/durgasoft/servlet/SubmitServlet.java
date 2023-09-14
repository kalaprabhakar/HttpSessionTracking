package com.durgasoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			long ephno = Long.parseLong(request.getParameter("ephno"));
			String eemail = request.getParameter("eemail");
			
			HttpSession httpSession = request.getSession();
			String ename = (String)httpSession.getAttribute("ename");
			Float esal = (Float)httpSession.getAttribute("esal");
			String eaddr = (String)httpSession.getAttribute("eaddr");
			long epin = (Long)httpSession.getAttribute("epin");
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red' align='center'>");
			out.println("User Details </h1>");
			out.println("<table align='center' border='1'>");
			out.println("<tr><td>Name</td><td>"+ename+"</td></tr>");
			out.println("<tr><td>Salary</td><td>"+esal+"</td></tr>");
			out.println("<tr><td>Address</td><td>"+eaddr+"</td></tr>");
			out.println("<tr><td>Pin</td><td>"+epin+"</td></tr>");
			out.println("<tr><td>Ph. No </td><td>"+ephno+"</td></tr>");
			out.println("<tr><td>Email id</td><td>"+eemail+"</td></tr>");
			out.println("</tabel></body></html>");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
