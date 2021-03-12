package com.oop.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.userDBUtil;
//import com.user.user;

 
 //Servlet implementation class ticketDetailServlet
  
@WebServlet("/ticketDetailServlet")
public class ticketDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nic = request.getParameter("nic");
	    String password = request.getParameter("pass");
	    
	    try {
      	  List<com.oop.model.user> userDetails = userDBUtil.validate(nic,password);//userDBUtil.validate(nic,password);
      	  request.setAttribute("userDetails", userDetails);
	    }
	    catch (Exception e) {
		e.printStackTrace();
	    }
	    
	    
	    RequestDispatcher dis = request.getRequestDispatcher("showTicketDetail.jsp");
	    dis.forward(request, response);
	    
	}

}
