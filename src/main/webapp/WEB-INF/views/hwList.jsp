<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Hardware List Page</title>
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<div class="container"></div>
	<hr>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Hardware Type</th>
					<th>Brand</th>
					<th>Model</th>
					<th>Numbers</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${hardwares}" var="hw">
					<tr>
						<td>${hw.hwtype}</td>
						<td>${hw.brand}</td>
						<td>${hw.model}</td>
						<td>${hw.numbers}</td>
						<td><a type="butten" class="btn btn-success" href="/useHW?id=${hw.id}">Use Hardware</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a type="button" class="btn btn-success" href="/">Go to Home Page</a>
	</div>
	<script type="text/javascript" src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
</body>
</html>