<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Fruity loops</title>
</head>
<body>
	<div class="container mt-4">
		<h1 class="text-danger">Fruit Store</h1>
		<div class="bg-danger mt-4 p-5 w-50">
			<table class="table table-bordered border-danger bg-white">
				<thead> 
					<tr>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="fruits" items="${fruits}">
						<tr>
							<td> ${fruits.getName()}</td>
							<td> ${fruits.getPrice()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>