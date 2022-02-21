<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<bodystyle="background-color: cyne">
<%@include file="Header.jsp" %>
<center>
			<h1>Registration Form</h1>
			<form action="RegistrationCtl" method="post">
				<table>
					<tr>
						<td>first<input type="text" name="first"></td>
					</tr>
				
					<tr>
						<td>last<input type="text" name="last"></td>
					</tr>
					<tr>
						<td>
						Gender<input type="radio" name="gender" value="male">Male
						 <input type="radio" name="gender" value="female">Female
						</td>
					</tr>
					<tr>
						<td>Dob <input type="date" name="dob"></td>
					</tr>
					<tr>
						<td>MoblieNO <input type="text" name="moblie"></td>
					</tr>
					<tr>
					 <% String error=(String)request.getAttribute("error");
                if(error!=null){
                  %>
                  <%=error %>
                  <%} %>
               
						<td>gmail<input type="email" name="gmail">
						</td>
					</tr>
					<tr>
						<td>password<input type="password" name="pwd" >
						</td>
					</tr>
					<tr>
						<td><input type="submit" name="login"></td>
					</tr>
				</table>
		</center>

	</form>
<%@ include file="Footer.jsp"%>

</body>
</html>