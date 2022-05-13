<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Edit My Task</title>
</head>
<body>
	<div class="container">
		<div>
			<div class="d-flex justify-content-between">
				<h2>Edit Expense</h2>
				<a href="/expenses">Go back</a>
			</div>
			<form:form class="form" action="/expenses/${expense.id}/edit" method="post"
				modelAttribute="expense">
				<input type="hidden" name="_method" value="put">
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