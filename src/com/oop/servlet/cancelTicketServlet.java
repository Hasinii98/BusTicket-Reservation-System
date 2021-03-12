package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.userDBUtil;

 
@WebServlet("/cancelTicketServlet")
public class cancelTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String nic = request.getParameter("nic");
		boolean isTrue;
		
		isTrue = userDBUtil.cancelTicket(nic);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("cancel.jsp");
			dispatcher.forward(request,response);
		}
		else {
			 RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
		       dis.forward(request, response);
		}
		
		
	}

}
