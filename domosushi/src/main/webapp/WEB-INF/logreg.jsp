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
<title>DomoSushi-Admin</title>
</head>
<body>
	<div class="container mt-3">
		<h1 class="text-center text-success">DomoSushi-Admin</h1>
		<div class="d-flex justify-content-around">
			<h2>Register</h2>
			<h2>Login</h2>
		</div>
		<div class="d-flex justify-content-around">
			<form:form action="/register" method="post" modelAttribute="newAdmin">
				<div class="form-group">
					<form:label path="firstname">First Name:</form:label>
					<form:input path="firstname" class="form-control"/>
					<form:errors path="firstname" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="lastname">Last Name:</form:label>
					<form:input path="lastname" class="form-control"/>
					<form:errors path="lastname" class="text-danger"/>
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
					<form:label path="confirm">Confirm PW:</form:label>
					<form:password path="confirm" class="form-control"/>
					<form:errors path="confirm" class="text-danger"/>
				</div>
				<button class="btm btn-primary">Register</button>
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
				<button class="btm btn-primary">Login</button>
			</form:form>
		</div>
	</div>
</body>
</html>