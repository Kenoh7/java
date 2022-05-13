<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Product Manager Dashboard</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1>Welcome, ${user.firstName}!</h1>
			<a href="/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<p>All Projects</p>
			<a class="btn btn-outline-secondary" href="/projects/new">+ new
				project</a>
		</div>
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>Project</th>
						<th>Team Lead</th>
						<th>Due Date</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="project" items="${projects}">
						<tr>
							<td><a href="/projects/${project.id}"><c:out
										value="${project.title}" /></a></td>
							<td>${project.teamlead.firstName}</td>
							<td><fmt:formatDate value="${project.duedate}"
									pattern="MMM dd" /></td>
							<c:choose>
								<c:when test="${project.teamlead.id.equals(userId)}">
									<td><a class="btn btn-secondary"
										href="/projects/${project.id}/edit">Edit</a></td>
									<td>
										<form action="/projects/${project.id}/delete" method="post">
											<input type="hidden" name="_method" value="delete" />
											<button class="btn btn-danger">Delete</button>
										</form>
									</td>
								</c:when>
								<c:otherwise>
									<td></td>
									<td></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<div>
			<p>Your Projects</p>
		</div>
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>Project</th>
						<th>Team Lead</th>
						<th>Due Date</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="project" items="${user.createProject}">
						<tr>
							<td><a href="/projects/${project.id}"><c:out
										value="${project.title}" /></a></td>
							<td>${project.teamlead.firstName}</td>
							<td><fmt:formatDate value="${project.duedate}"
									pattern="MMM dd" /></td>
							<c:choose>
								<c:when test="${project.teamlead.id.equals(userId)}">
									<td><a class="btn btn-secondary"
										href="/projects/${project.id}/edit">Edit</a></td>
									<td>
										<form action="/projects/${project.id}/delete" method="post">
											<input type="hidden" name="_method" value="delete" />
											<button class="btn btn-danger">Delete</button>
										</form>
									</td>
								</c:when>
								<c:otherwise>
									<td></td>
									<td></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</body>
</html>