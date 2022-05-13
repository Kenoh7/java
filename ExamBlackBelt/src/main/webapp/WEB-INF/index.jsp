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
<title>Joy Bundle Dashboard</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1 class="text-success">Hello, ${user.name}. Here are some name suggestions</h1>
			<a href="/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<h2>Baby Names</h2>
			<h2 class="text-info">Voted</h2>
		</div>
		<div>
			<c:forEach var="baby" items="${babys}">
			<div class="d-flex justify-content-around">
				<c:choose>
					<c:when test="${baby.votedUsers.contains(user)}">
					<p></p>
					</c:when>
					<c:otherwise>
						<form action="/names/${baby.id}/vote" method="post">
							<input type="hidden" name="_method" value="put"/>
							<button class="btn btn-primary">upvote!</button>
						</form>
					</c:otherwise>
				</c:choose>
				<a href="/names/${baby.id}"><c:out value="${baby.name}"></c:out></a>
				<p>${baby.gender}</p>
				<p>Origin: ${baby.origin}</p>
				<p class="text-info">${baby.votedUsers.size()}</p>
			</div>
			<hr>
			</c:forEach>
		</div>
		<a class="btn btn-success"href="/names/new"> ⫷ new Name</a>
	</div>
</body>
</html>