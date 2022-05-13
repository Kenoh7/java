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
<title>Show Name</title>
</head>
<body>
	<div class="container mt-3">
		<h1><c:out value="${baby.name}"></c:out></h1>
		<p>(Added by ${baby.provider.name})</p>
		<p><span class="fw-bold">Gender:</span> ${baby.gender}</p>
		<p><span class="fw-bold">Origin:</span> ${baby.origin}</p>
		<c:choose>
			<c:when test="${baby.votedUsers.contains(user)}">
				<p class="text-info">You voted for this name.</p>
			</c:when>
			<c:otherwise>
				<form action="/names/${baby.id}/vote" method="post">
					<input type="hidden" name="_method" value="put"/>
					<button class="btn btn-primary">upvote!</button>
				</form>
			</c:otherwise>
		</c:choose>
		<p><span class="fw-bold">Meaning:</span> ${baby.meaning}</p>
		<hr>
		<c:choose>
			<c:when test="${baby.provider.id.equals(userId)}">
				<a class="btn btn-success"href="/names/${baby.id}/edit"> ⫷ Edit</a>
			</c:when>
			<c:otherwise>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>