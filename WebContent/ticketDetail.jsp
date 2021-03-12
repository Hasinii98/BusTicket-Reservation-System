 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="ticketDetail.css">
<jsp:include page="header.jsp"/>
</head>
<body>

<div class="ticket">
<h1>Ticket Details</h1>



	<form action="ticket" method="post">

		<input type="text" class="form-control" name="nic" placeholder="Enter NIC" style="width:300px; height:35px;"> <br>
		<input type="password" class="form-control" name="pass" placeholder="Enter password" style="width:300px; height:35px;"><br>	
		<input class="form-control submit" type="submit" name="submit" value="Submit" style="width:300px;">
	</form>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
 