<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>body {
background-color: lightblue;
}</style>
<title>MovieAddicts</title>
</head>
<body>
  <%@include  file="header.jsp" %>
<table>
<tbody>
            <c:forEach items="${movies}" var="movie">
            </c:forEach>

</tbody>

</table>
    <table align="center">

        <tbody>

 <c:forEach items="${movies}" var="movie" varStatus="loop">
     <c:if test="${loop.index mod 4 eq 0}">
        <tr>
    </c:if>
                    <td align="center"><a href="MovieController.do?action=movie&movieid=<c:out value="${movie.movieid }"/>"><c:out value="${movie.moviename}" /><br /><img style="height: 280px; width: 210px;" src="<c:out value="${movie.movieimagelocation}" />"></a></td>
                    
                    
    <c:if test="${(loop.index+1) mod 4 eq 0 or loop.last}">
        </tr>
    </c:if>
    

            </c:forEach>

     
        </tbody>
    </table>

</body>
</html>