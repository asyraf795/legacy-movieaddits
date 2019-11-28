<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <style>
body {
background-color: lightblue;
}
 </style>
<title>MovieAddicts</title>
</head>

<body>
  <%@include  file="header.jsp" %>
  <div>
	<h1 align="center">${movie.moviename}</h1>
</div>
    <form action="BookingController.do" method="post" onsubmit="return validateMyForm();">

<table align="center">
	<tr>

<td >
		<td width=500px style="font-size: 30px;">
		<b>Genre:</b> ${movie.moviegenre}</br>
		<b>Rating:</b> ${movie.movierating} %</br>
		<b>Actor(s):</b> ${movie.movieactors}</br>
		<b>Release Date:</b> ${movie.moviereleasedate}</br>
		<b>Synopsis:</b> ${movie.moviedescription}</br>
		<b>Quantity left:</b> <input type="text" style="background-color: lightblue; border: none; font-size:30px;"name="moviequantity" value="<c:out value="${movie.moviequantity}" />"></br>
		<input type="hidden" name="userid" value="<c:out value="${sessionScope.userid }"/>">
		<input type="hidden" name="movieid" value="<c:out value="${movie.movieid}" />">
		<b>Booking:</b></br><input type="date" name="bookingdate" required>
<input type="submit" name="confirmbook" value="Confirm Book">
		</td>
		<td width=500px>
		<img src="${movie.movieimagelocation}">
		</td>

	</tr>
</table>


   </form>
   <script type="text/javascript">
function validateMyForm()
{
  if(userid == null)
  { 
    alert("Login first");
    returnToPreviousPage();
    return false;
  } else if (moviequantity == "0") {
	alert("Currently not available")
	returnToPreviousPate();
  }

  alert("Successfully Booked");
  return true;
}
</script>
</body>
</html>