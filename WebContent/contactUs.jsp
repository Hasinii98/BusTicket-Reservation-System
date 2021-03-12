 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
 <!DOCTYPE html>
<html>
<head> 
	<meta charset="ISO-8859-1">
	<title>Contact us</title>
	<link rel="stylesheet" type="text/css" href="userInsert.css">
	 <jsp:include page="header.jsp"/>
</head>
<body>
<div class="box">
<h1>CONTACT US</h1>

<form action="insert" method="post" class=htw>

		 <input type="text"class="form-control" name="nic" placeholder="Enter your NIC" style="width:200px; height:35px;"><br>
		 <input type="text" class="form-control" name="email" placeholder="Enter your email" style="width:200px; height:35px;"><br> 
		 <textarea name="message" class="form-control" placeholder="Message" rows="4" style="width:400px;"></textarea><br>
		<input type="submit" class="form-control submit" name="send message" value="SEND MESSAGE" style="width:200px;">
	</form>
</div>

 <jsp:include page="footer.jsp"/>

</body>
</html>