<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PersonInfo</title>
</head>
<body>
	<center>
		<h1>
			<font color="red"> Welcome Page </font>
		</h1>
	
	
	<form:form action="adduser" modelAttribute="person" method="post">
		<table>
			<tbody>

				<tr>
					<td><label> FirstName : </label></td>
					<td><form:input path="firstName"  name="firstName"  type="text" placeholder="Enter First Name" /></td>
				</tr>
				<tr>
					<td><label>LastName : </label></td>
					<td><form:input path="lastName" name="lastName" placeholder="Enter Last Name" /></td>
				</tr>
				<tr>
					<td><label>MiddleName : </label></td>
					<td><form:input path="middleName" name="middleName" placeholder="Enter Middle Name" /></td>
				</tr>
				<tr>
					<td><label> EmailAddress : </label></td>
					<td><form:input path="email"  name="email" placeholder="Enter Email Address" /></td>
				</tr>

				<tr>
					<td colspan="2">
					<input type="submit" value="register">
					</td>
				</tr>

		
			</tbody>
		</table>
	</form:form>
	</center>

</body>
</html>

