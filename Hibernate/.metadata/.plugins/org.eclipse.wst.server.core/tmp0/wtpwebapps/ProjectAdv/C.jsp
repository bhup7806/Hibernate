<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 C
    <%
    request.setAttribute("c", "three");
    
 String A=(String)request.getAttribute("a");
 String B=(String)request.getAttribute("b");
 String C=(String)request.getAttribute("c");
 %>
 <h1><%=A%></h1>
 <h1><%=B%></h1>
 <h1><%=C%></h1>
</body>
</html>