<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to BikkadIt</title>
</head>

<body>
<p align="center"><a href="createUser">Click here for New Registration</a></p>

<form:form action="saveUser? id=${user.id}" modelAttribute="user" method="POST">

<table>

<tr>
<td>User Name</td>
<td><form:input path="username"/></td>
</tr>

<tr>
<td>User Password</td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td><input type="Submit" value="Save"/></td>

</tr>


</table>


</form:form>

</body>

</body>
</html>