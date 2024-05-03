
<%@page import="com.apex.springmvc.model.Bank"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bank Info</title>
</head>
<body>
<center>
 Email :   ${person.email} 
	<form:form action="bankInfo" modelAttribute="bank" method="post">
		<table>
			<tbody>
                 <tr>
						<td><label for="bankName">Bank Name: </label></td>
						<td><form:select path="bankName" id="bankName" >
							
							    <form:option value="JPMorgan Chase" /> Chase	
								<form:option value="Bank of America" /> Bank of America
								<form:option value="Wells Fargo" /> Wells Fargo
								<form:option value="State Bank of India" /> State Bank of India
								<form:option value="American Express" /> American Express
						
							</form:select></td>
					</tr>
				<tr>
						<td><label> Account Number: </label></td>
						<td><form:input path="accountNumber"  name="accountNumber" placeholder="Enter Account Number"  />
						</td>
					</tr>
				<tr>
					<td><label>SSN : </label></td>
					<td><form:input path="ssn" name="ssn" placeholder="Enter SSN" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Submit"></td>
				</tr>
			
			</tbody>
		</table>
    </form:form>
</center>
</body>
</html>