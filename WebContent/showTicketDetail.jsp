<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
 <head>
	<meta charset="ISO-8859-1">
	<title>Show Ticket Detail</title>
	<link rel="stylesheet" href="showTicketDetail.css">
	<jsp:include page="header.jsp"/>
	 </head>

<body>

<div class="box">

<h1>Ticket Details</h1><br><br>

<table class="text" style="width:400px" border;>
	<c:forEach var="us" items="${userDetails}">
	
	
	<c:set var="nic" value="${us.nic}"/>
	<c:set var="fname" value="${us.fname}"/>
	<c:set var="lname" value="${us.lname}"/>
	<c:set var="mobile" value="${us.mobile}"/>
	<c:set var="email" value="${us.email}"/>
	<c:set var="address" value="${us.address}"/>
	<c:set var="password" value="${us.password}"/>
	<c:set var="departure" value="${us.departure}"/>
	<c:set var="arrive" value="${us.arrive}"/>
	<c:set var="date" value="${us.date}"/> 
	<c:set var="tripId" value="${us.tripId}"/>
	
	 <tr>
	 <th>NIC :</th>
	 <th>${us.nic}</th>
	 </tr><br><br>
	 
	<tr>
		<th>First Name  :</th>
		<th>${us.fname}</th>
		
	</tr>
	
	<tr>
		<th>Last Name  :</th>
		<th>${us.lname}</th>
	</tr>
	
	<tr>
		<th>Mobile Number:</th>
		<th>${us.mobile}</th>
	</tr>
	
	<tr>
		<th>Email  :</th>
		<th>${us.email}</th>
	</tr>
	
	<tr>
		<th>Address  :</th>
		<th>${us.address}</th>
	</tr>
	
	<tr>
		<th>Password  :</th>
		<th>${us.password}</th>
	</tr>	
	
	<tr>
		<th>Departure  :</th>
		<th>${us.departure}</th>
	</tr>
	
	<tr>
		<th>Arrive  :</th>
		<th>${us.arrive}</th>
	</tr>
	
	<tr>
		<th>Date  :</th>
		<th>${us.date}</th>
	</tr>
	
	<tr>
		<th>Trip Id  :</th>
		<th>${us.tripId}</th>
	</tr>
	 	
	</c:forEach>
		</table><br><br>
	
	
  <c:url value="updateTicket.jsp" var="usupdate">
		<c:param name="nic" value="${nic}"/>
		<c:param name="fname" value="${fname}"/>
		<c:param name="lname" value="${lname}"/>
		<c:param name="mobile" value="${mobile}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="password" value="${password}"/>
		<c:param name="departure" value="${departure}"/>
		<c:param name="arrive" value="${arrive}"/>
		<c:param name="date" value="${date}" />
		<c:param name="tripId" value="${tripId}"/>
	</c:url>
	
	<a href="${usupdate}">
	<input type="button" class="btn" name="Reschedule Ticket" value="Reschedule Ticket" style="color: white; border-color:#08bcda; border-width:medium;">
	</a>
	
	 <c:url value="cancelTicket.jsp" var="cancelTicket">
		<c:param name="nic" value="${nic}"/>
		<c:param name="fname" value="${fname}"/>
		<c:param name="lname" value="${lname}"/>
		<c:param name="mobile" value="${mobile}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="password" value="${password}"/>
		<c:param name="departure" value="${departure}"/>
		<c:param name="arrive" value="${arrive}"/>
		<c:param name="date" value="${date}" />
		<c:param name="tripId" value="${tripId}"/>
	</c:url>
	
	<a href="${cancelTicket}">
	<input type="button" class="btn" name="Cancel Ticket" value="Cancel Ticket" style="color: white; border-color:#08bcda; border-width:medium;">
	</a>
	
	<div>
	
 <jsp:include page="footer.jsp"/> 
   
</body>
</html>