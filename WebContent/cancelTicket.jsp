<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
	<meta charset="ISO-8859-1">
	<title>Cancel ticket</title>
	<link rel="stylesheet"  href="cancelTicket.css">
 <jsp:include page="header.jsp"/>
</head>
<body>	


<%
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
		
	%>	
	
	<div class="box">
	
	<h1>Ticket Cancellation</h1><br><br>
	
	<form action="cancel" method="post" style="width:500px;">
	<table class="text">
		<tr>
			<th>NIC</th>
			<th><input type="text" name="nic" value="<%= nic %>" readonly></th>
		</tr>
		<tr>
			<th>First Name</th>
			<th><input type="text" name="fname" value="<%= fname %>" readonly></th>
		</tr>
		<tr>
		<th>Last Name</th>
		<th><input type="text" name="lname" value="<%= lname %>" readonly> </th>
	</tr>
	<tr>
		<th>Mobile number</th>
		<th><input type="text" name="mobile" value="<%= mobile %>" readonly></th>
	</tr>
	<tr>
		<th>Email</th>
		<th><input type="text" name="email" value="<%= email %>" readonly></th>
	</tr>
	<tr>
		<th>Address</th>
		<th><input type="text" name="address" value="<%= address %>" readonly></th>
	</tr>	
	<tr>
		<th>Password</th>
		<th><input type="password" name="password" value="<%= password %>" readonly></th>
	</tr>
	<tr>
		<th>Departure</th>
		<th><input type="text" name="departure" value="<%= departure %>" readonly></th>
	</tr>
	<tr>
		<th>Arrive</th>
		<th><input type="text" name="arrive" value="<%= arrive %>" readonly></th>
	</tr>
	<tr>
		<th>Date</th>
		<th><input type="text" name="date" value="<%= date %>" readonly></th>
	</tr>
	<tr>
		<th>Trip ID</th>
		<th><input type="text" name="tripId" value="<%= tripId %>" readonly></th>
	</tr>
		
	</table>
	<br>
	<input class="submit" type="submit" name="cancelTicket" value="Cancel Ticket"  style="border-width:medium;">
	</form>
	
	<div>
	
	 <jsp:include page="footer.jsp"/>

</body>
</html>