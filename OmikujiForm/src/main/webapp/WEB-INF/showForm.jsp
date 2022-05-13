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
		<h1>Here's Your Omikuji!</h1>
		<div class="p-5 bg-primary w-25 mb-3">
			<p>
				In ${pickNumber} years, you will live in ${cityName}
				with ${namePerson} as your roommate, ${hobby}
				for a living. The next time you
				see a ${pet}, you will have good luck.
				Also, ${sayNice}
			</p>
		</div>
		<a href="http://127.0.0.1:8080/omikuji">Go Back</a>
	</div>
</body>
</html>