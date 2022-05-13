<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Send an Omikuji!</h1>
		<form action="processForm" method="POST" class="form">
			<div class="mb-3">
				<label class="form-label">Pick any Number from 5 to 25</label>
				<input class="form-control" type="number" name="pickNumber"/>
			</div>
			<div class="mb-3">
				<label class="form-label">Enter the name of any city.</label>
				<input class="form-control" type="text" name="cityName"/>
			</div>
			<div class="mb-3">
				<label class="form-label">Enter the name of any real person</label>
				<input class="form-control" type="text" name="namePerson"/>
			</div>
			<div class="mb-3">
				<label class="form-label">Enter professional endeavor or hobby:</label>
				<input class="form-control" type="text" name="hobby"/>
			</div>
			<div class="mb-3">
				<label class="form-label">Enter any type of living thing.</label>
				<input class="form-control" type="text" name="pet"/>
			</div>
			<div class="mb-3">
				<label class="form-label">Say something nice to someone:</label>
				<textarea class="form-control" name="sayNice"></textarea>
			</div>
			<p>Send and show a friend</p>
			<button class="btn btn-primary">Send</button>
		</form>
	</div>
</body>
</html>