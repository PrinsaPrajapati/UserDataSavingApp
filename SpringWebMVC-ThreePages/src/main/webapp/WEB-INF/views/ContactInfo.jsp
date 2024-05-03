<%@page import="com.apex.springmvc.model.Contact"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Info</title>
</head>
<body>
<center>
Email  : ${person.email}
<form:form action="contactInfo" modelAttribute="contact" method="post">
		<table>
			<tbody>

				<tr>
					<td><label> Address : </label></td>
					<td><form:input path="address" name="address"  placeholder="Enter Address" /></td>
				</tr>
				<tr> 
					<td><label>City : </label></td>
					<td><form:input path="city" name="city" placeholder="Enter city" /></td>
				</tr>
				<tr>
					<td><label>State : </label></td>
					<td><form:input path="state" name="state" placeholder="Enter State" /></td>
				</tr>
				<tr>
					<td><label> Country : </label></td>
					<td><form:input path="country" name="country" placeholder="Enter country" /></td>
				</tr>
				<tr>
					<td><label> PhoneNumber : </label></td>
					<td><form:input path="phoneNumber" name="phoneNumber" placeholder="Enter PhoneNumber" /></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="Submit">
					</td>
				</tr>
				

			</tbody>
		</table>
	</form:form>
	</center>
	
</body>
</html>

