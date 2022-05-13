<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Show Expense</title>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-between">
			<h2>Expense Details</h2>
			<a href="/expenses">Go back</a>
		</div>
		<div>
			<p> Expense Name: <c:out value="${expense.name}"><</c:out></p>
			<p> Expense Description: ${expense.description }</p>
			<p> Vendor: ${expense.vendor }</p>
			<p> Amount Spent: $ ${expense.amount}0</p>
		</div>
	</div>
</body>
</html>