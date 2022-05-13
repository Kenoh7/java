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
	<h1>Change ${baby.name}</h1>
		<div>
			<form:form action="/names/${baby.id}/edit" method="post" modelAttribute="baby">
			<input type="hidden" name="_method" value="put"/>
			<form:hidden path="provider" value="${baby.provider.id}"/>
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
				<div class="text-center">
					<a class="btn btn-secondary"href="/home">Cancel</a>
					<button class="btn btn-primary">Submit</button>
				</div>
			</form:form>
				<form action="/names/${baby.id}/delete" method="post">
					<input type="hidden" name="_method" value="delete"/>
					<button class="btn btn-danger">Delete</button>
				</form>
		</div>
	</div>
</body>
</html>