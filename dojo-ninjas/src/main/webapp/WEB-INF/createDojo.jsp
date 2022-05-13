<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>New Dojo</title>
</head>
<body>
	<div class="container">
		<h1>New Dojo</h1>
		<form:form action="/dojos/new" method="post" modelAttribute="dojo" class="form-control">
			<div>
				<form:label path="name" class="form-label"> Name: </form:label>
				<form:input path="name" class="form-control" />
				<form:errors path="name" class="text-danger"/>
			</div>
			<button class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>