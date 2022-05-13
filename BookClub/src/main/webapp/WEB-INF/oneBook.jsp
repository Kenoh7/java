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
<title>Book Share</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex justify-content-between">
			<h1>${book.title}</h1>
			<a href="/home">back to the shelves</a>
		</div>
		<div>
			<h3><span class="text-primary">${book.creator.name}</span> read <span class="text-danger">${book.title}</span> by <span class="text-success">${book.authorName}</span></h3>
			<h3>Here are ${book.creator.name} thoughts</h3>
			<hr/>
			<p>${book.thought}</p>
			<hr/>
			<div class="d-flex">
				<c:choose>
					<c:when test="${book.creator.id.equals(userId)}">
						<a class="btn btn-default"  href="/books/${book.id}/edit">Edit</a>
							<form action="/books/${book.id}/delete" method="post">
								<input type="hidden" name="_method" value="delete"/>
								<button class="btn btn-danger">Delete</button>
							</form>
					</c:when>
					<c:otherwise>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</body>
</html>