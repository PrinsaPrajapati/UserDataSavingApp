<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<center>
<h2>SpringWebMVC & Rest API & Hibrernate Project Integration Example</h2>
<hr>
<h2>User Personal Details</h2>
<hr>
<table>
<tr>
<td>First Name   :</td><td>${person.firstName}</td>
</tr>

<tr>
<td>Last Name    :</td><td>${person.lastName}</td>
</tr>

<tr>
<td>Middle Name  :</td><td>${person.middleName}</td>
</tr>

<tr>
<td>Email        :</td><td>${person.email}</td>
</tr>
</table>
<hr>
<h2>User Contact Details</h2>
<hr>
<table>
<tr>
<td>Address      :</td><td>${contact.address}</td>
</tr>

<tr>
<td>city         :</td><td>${contact.city}</td>
</tr>  

<tr>
<td>State        :</td><td>${contact.state}</td>
</tr>

<tr>
<td>Country      :</td><td>${contact.country}</td>
</tr>

<tr>
<td>PhoneNumber  :</td><td>${contact.phoneNumber}</td>
</tr>
</table>
<hr>
<h2>User Bank Details</h2>

<table>
<tr>
<td>BankName      :</td><td>${bank.bankName}</td>
</tr>

<tr>
<td>AccountNumber :</td><td>${bank.accountNumber}</td>
</tr>

<tr>
<td>SSN           :</td><td>${bank.ssn}</td>
</tr>
<hr>
</table>
</center>
</body>
</html>