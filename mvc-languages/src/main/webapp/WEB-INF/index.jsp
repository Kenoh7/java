<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>
	<div class="container mt-5">
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th colspan="2">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="language" items="${languages}">
						<tr>
							<td><a href="/languages/${language.id}"><c:out value="${language.name}"></c:out></a></td>
							<td>${language.creator}</td>
							<td>${language.currentVersion}</td>
							<td>
								<form action="/languages/${language.id}" method="post">
									<input type="hidden" name="_method" value="delete">
									<button class="btn btn-danger">Delete</button>
								</form>
							</td>
							<td>
								<a href="/languages/${language.id}/edit">Edit</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<form:form class="form" action="/languages/create" method="post"
				modelAttribute="language">
				<p>
					<form:label path="name">Name</form:label>
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
					<form:input type="number" step="0.1" path="currentVersion" />
					<form:errors class="text-danger" path="currentVersion" />
				</p>
				<button class="btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>