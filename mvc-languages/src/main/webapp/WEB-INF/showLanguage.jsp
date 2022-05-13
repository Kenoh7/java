<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<a href="/languages">Dashboard</a>
		</div>
		<div>
			<p>
				<c:out value="${language.name}"></c:out>
			</p>
			<p>${language.creator }</p>
			<p>${language.currentVersion }</p>
			<a href="/languages/${language.id}/edit">Edit</a>
			<form action="/languages/${language.id}" method="post">
				<input type="hidden" name="_method" value="delete">
				<button class="btn btn-danger">Delete</button>
			</form>
		</div>
	</div>
</body>
</html>