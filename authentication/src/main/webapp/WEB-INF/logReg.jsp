<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Login & Registration</title>
</head>
<body>
	<div class="container mt-4">
		<h1 class="text-center">Welcome!</h1>
		<p class="text-center">Join our growing community</p>
		<div class="d-flex justify-content-around">
			<h2>Register</h2>
			<h2>Login</h2>
		</div>
		<div class="d-flex justify-content-around">
			<form:form action="/register" method="post" modelAttribute="newUser">
				<div class="form-group">
					<form:label path="userName">User Name:</form:label>
					<form:input path="userName" class="form-control"/>
					<form:errors path="userName" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="email">Email:</form:label>
					<form:input path="email" class="form-control"/>
					<form:errors path="email" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password:</form:label>
					<form:password path="password" class="form-control"/>
					<form:errors path="password" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="confirm">Confirm Password:</form:label>
					<form:password path="confirm" class="form-control"/>
					<form:errors path="confirm" class="text-danger"/>
				</div>
				<button class="btm btn-primary">Submit</button>
			</form:form>
			<form:form action="/login" method="post" modelAttribute="newLogin">
				<div class="form-group">
					<form:label path="email">Email:</form:label>
					<form:input path="email" class="form-control"/>
					<form:errors path="email" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password:</form:label>
					<form:password path="password" class="form-control"/>
					<form:errors path="password" class="text-danger"/>
				</div>
				<button class="btm btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>