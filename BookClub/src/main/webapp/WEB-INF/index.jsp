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
			<h1>Welcome, ${user.name}!</h1>
			<a href="/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<p> Books from everyone's shelves:</p>
			<a href="/books/new">Add to my shelf!</a>
		</div>
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>
						<th>Posted By</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${books}">
						<tr>
							<td>${book.id}</td>
							<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
							<td>${book.authorName}</td>
							<td>${book.creator.name}</td>
							
							<c:choose>
								<c:when test="${book.creator.id.equals(userId)}">
									<td><a class="btn btn-default" href="/books/${book.id}/edit">Edit</a></td>
									<td>
										<form action="/books/${book.id}/delete" method="post">
											<input type="hidden" name="_method" value="delete"/>
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
		<h1>My Books</h1>
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>
						<th>Posted By</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${user.createBooks}">
						<tr>
							<td>${book.id}</td>
							<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
							<td>${book.authorName}</td>
							<td>${book.creator.name}</td>
							
							<c:choose>
								<c:when test="${book.creator.id.equals(userId)}">
									<td><a class="btn btn-default" href="/books/${book.id}/edit">Edit</a></td>
									<td>
										<form action="/books/${book.id}/delete" method="post">
											<input type="hidden" name="_method" value="delete"/>
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