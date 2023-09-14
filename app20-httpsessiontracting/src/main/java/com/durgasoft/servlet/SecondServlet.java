package com.durgasoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
try {
			
			String eaddr = request.getParameter("eaddr");
			long epin = Long.parseLong(request.getParameter("epin"));
			
			HttpSession httpSession = request.getSession(false);
			httpSession.setAttribute("eaddr", eaddr);
			httpSession.setAttribute("epin", epin);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./submit.html");
			requestDispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
