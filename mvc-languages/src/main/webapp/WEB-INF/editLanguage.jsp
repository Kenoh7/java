<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>${language.name}</title>
</head>
<body>
	<div class="container">
		<div>
			<div class="d-flex">
				<form action="/languages/${language.id}" method="post">
					<input type="hidden" name="_method" value="delete">
					<button class="btn btn-danger">Delete</button>
				</form>
				<a href="/languages">Dashboard</a>
			</div>
			<form:form class="form" action="/languages/${language.id}/edit" method="post"
				modelAttribute="language">
				<input type="hidden" name="_method" value="put">
				<p>
					<form:label path="name">Name:</form:label>
					<form:input path="name" />
					<form:errors class="text-danger" path="name" />
				</p>
				<p>
					<form:label path="creator">Creator:</form:label>
					<form:input path="creator" />
					<form:errors class="text-danger" path="creator" />
				</p>
				<p>
					<form:label path="currentVersion">Version:</form:label>
					<form:input type="number" path="currentVersion" />
					<form:errors class="text-danger" path="currentVersion" />
				</p>
				<button class="btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>