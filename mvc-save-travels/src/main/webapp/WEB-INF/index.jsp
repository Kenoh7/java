<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Read Share</title>
</head>
<body>
	<div class="container">
		<div>
			<h1>Save Travels</h1>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th colspan="2">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="expense" items="${expenses}">
						<tr>
							<td><c:out value="${expense.name}"></c:out></td>
							<td>${expense.vendor}</td>
							<td>$ ${expense.amount}0</td>
							<td>
								<a href="/expenses/${expense.id}/edit">Edit</a>
							</td>
							<td>
								<form action="/expenses/${expense.id}" method="post">
									<input type="hidden" name="_method" value="delete">
									<button class="btn btn-danger">Delete</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<h2>Add an Expense</h2>
			<form:form class="form" action="/expenses/create" method="post"
				modelAttribute="expense">
				<p>
					<form:label path="name">Expense Name:</form:label>
					<form:input path="name" />
					<form:errors class="text-danger" path="name" />
				</p>
				<p>
					<form:label path="vendor">Vendor:</form:label>
					<form:input path="vendor" />
					<form:errors class="text-danger" path="vendor" />
				</p>
				<p>
					<form:label path="amount">Amount:</form:label>
					<form:input type="number" path="amount" />
					<form:errors class="text-danger" path="amount" />
				</p>
				<p>
					<form:label path="description">Description:</form:label>
					<form:textarea path="description" />
					<form:errors class="text-danger" path="description" />
				</p>
				<button class="btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>