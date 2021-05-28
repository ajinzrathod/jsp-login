<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.inp-field {
	display: block;
	padding: 5px;
	margin: 5px;
}
</style>
</head>
<body>
	<% if(session.getAttribute("can_login")!=null && Boolean.TRUE.equals(session.getAttribute("can_login"))) { %>
		<p>Login status: ${can_login}</p>
		<p>Signed in Successfully.</p>
		<p> <a href="logout">Logout</a></p>
	<% } else { %>
		<%  if(session.getAttribute("can_login")!=null && Boolean.FALSE.equals(session.getAttribute("can_login"))) {%> 
		<p>Incorrect Credentials</p>
		<% } %>
		<div>
			<form action="login" method="post">
				Username: <input type="text" name="username" class="inp-field">
				Password: <input type="password" name="password" class="inp-field">
				<input type="submit" class="inp-field" value="Login">
			</form>
		</div>
	<% } %>
</body>
</html>