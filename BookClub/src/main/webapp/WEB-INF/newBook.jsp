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
<title>Book Share</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex justify-content-between">
			<h1>Add a Book to Your Shelf!</h1>
			<a href="/home">back to the shelves</a>
		</div>
		<div>
			<form:form action="/books/new" method="post" modelAttribute="book">
			<form:hidden path="creator" value="${userId}"/>
				<div class="form-group">
					<form:label path="title">Title:</form:label>
					<form:input path="title" class="form-control"/>
					<form:errors path="title" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="authorName">Author:</form:label>
					<form:input path="authorName" class="form-control"/>
					<form:errors path="authorName" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="thought">My Thoughts:</form:label>
					<form:textarea path="thought" class="form-control"/>
					<form:errors path="thought" class="text-danger"/>
				</div>
				<button class="btn btn-primary">Submit</button>
			</form:form>
			
		</div>
	</div>
</body>
</html>