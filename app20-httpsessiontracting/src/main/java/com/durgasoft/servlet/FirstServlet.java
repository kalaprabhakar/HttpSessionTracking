package com.durgasoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String ename = request.getParameter("ename");
			Float esal = Float.parseFloat(request.getParameter("esal"));
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("ename", ename);
			httpSession.setAttribute("esal", esal);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./second.html");
			requestDispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
