<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>New Ninjas</title>
</head>
<body>
	<div class="container">
		<h1>New Ninja</h1>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja"
			class="form-control">
			<div>
				<form:label path="dojo" class="form-label"> Dojo: </form:label>
				<form:select path="dojo" class="form-select">
					<c:forEach var="dojo" items="${dojos }">
						<form:option value="${dojo.id}">${dojo.name}</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div>
				<form:label path="firstName" class="form-label"> First Name: </form:label>
				<form:input path="firstName" class="form-control" />
				<form:errors path="firstName" class="text-danger" />
			</div>
			<div>
				<form:label path="lastName" class="form-label"> Last Name: </form:label>
				<form:input path="lastName" class="form-control" />
				<form:errors path="lastName" class="text-danger" />
			</div>
			<div>
				<form:label path="age" class="form-label"> Age </form:label>
				<form:input type="number" path="age" class="form-control" />
				<form:errors path="age" class="text-danger" />
			</div>
			<button class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>