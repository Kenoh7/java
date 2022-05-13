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
<title>Project Details</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1>Project Details</h1>
			<a href="/dashboard">Back to Dashboard</a>
		</div>
		<p>
			Project:
			<c:out value="${project.title}" />
		</p>
		<p>
			Description:
			<c:out value="${project.description}" />
		</p>
		<p>
			Due Date:
			<fmt:formatDate value="${project.duedate}" pattern="MM/dd/yyyy" />
		</p>
		<c:choose>
			<c:when test="${project.teamlead.id.equals(userId)}">
				<form action="/projects/${project.id}/delete" method="post">
					<input type="hidden" name="_method" value="delete" />
					<button class="btn btn-danger">Delete</button>
				</form>
			</c:when>
			<c:otherwise>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>