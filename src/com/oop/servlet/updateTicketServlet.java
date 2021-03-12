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

 
@WebServlet("/updateTicketServlet")
public class updateTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nic = request.getParameter("nic");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		String departure = request.getParameter("departure");
		String arrive = request.getParameter("arrive");
		String date = request.getParameter("date");
		String tripId = request.getParameter("tripId");
		
boolean isTrue;
		
		isTrue = userDBUtil.updateuser(nic, fname, lname, mobile, email, address, password, departure, arrive, date, tripId);
		
   if(isTrue == true) {
	   
	        List<com.oop.model.user> userDetails = userDBUtil.getUserDetails(nic);// userDBUtil.getUserDetails(nic);
		    request.setAttribute("userDetails", userDetails);   
	    		    
			RequestDispatcher dis = request.getRequestDispatcher("showTicketDetail.jsp");
			dis.forward(request, response);
		}
   else {
	          
		   
		   RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
	       dis.forward(request, response);
}
	}

}
