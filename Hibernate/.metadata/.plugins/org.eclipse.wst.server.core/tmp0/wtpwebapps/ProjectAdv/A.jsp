<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 A
    <%
      request.setAttribute("a", "one");
    %>
    <jsp:forward page="B.jsp"></jsp:forward> 
  <%--%>
    response.sendRedirect("B.jsp");
    
    <%
    --%>
</body>
</html>