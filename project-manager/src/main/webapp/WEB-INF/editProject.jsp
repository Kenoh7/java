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
<title>Edit My Task</title>
</head>
<body>
	<div class="container mt-3">
		<h1>Edit A Project</h1>
		<form:form action="/projects/${project.id}/edit" method="post"
			modelAttribute="project">
			<input type="hidden" name="_method" value="put"/>
			<form:hidden path="teamlead" value="${project.teamlead.id}"/>
			<div class="form-group">
				<form:label path="title">Project Title:</form:label>
				<form:input path="title" class="form-control" />
				<form:errors path="title" class="text-danger" />
			</div>
			<div class="form-group">
				<form:label path="description">Description:</form:label>
				<form:textarea path="description" class="form-control" />
				<form:errors path="description" class="text-danger" />
			</div>
			<div class="form-group">
				<form:label path="duedate">Due Date:</form:label>
				<form:input path="duedate" type="date" class="form-control" />
				<form:errors path="duedate" class="text-danger" />
			</div>
			<a class="btn btn-secondary"href="/dashboard">Cancel</a>
			<button class="btn btn-primary">Submit</button>
		</form:form>

	</div>
</body>
</html>