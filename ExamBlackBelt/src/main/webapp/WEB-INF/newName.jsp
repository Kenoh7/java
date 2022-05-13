<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Create A Name</title>
</head>
<body>
	<div class="container mt-3">
	<h1>Add a Name!</h1>
		<div>
			<form:form action="/names/new" method="post" modelAttribute="baby">
				<form:hidden path="provider" value="${userId}"/>
				<div class="form-group">
					<form:label path="name">New Name:</form:label>
					<form:input path="name" class="form-control"/>
					<form:errors path="name" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="gender" class="form-label"> Typical Gender: </form:label>
					<form:select path="gender" class="form-select">
						<form:option value="male">Male</form:option>
						<form:option value="female">Female</form:option>
						<form:option value="neutral">Neutral</form:option>
					</form:select>
					<form:errors path="gender" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="origin">Origin:</form:label>
					<form:input path="origin" class="form-control"/>
					<form:errors path="origin" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="meaning">Meaning:</form:label>
					<form:textarea path="meaning" class="form-control"/>
					<form:errors path="meaning" class="text-danger"/>
				</div>
				<a class="btn btn-secondary"href="/home">Cancel</a>
				<button class="btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>