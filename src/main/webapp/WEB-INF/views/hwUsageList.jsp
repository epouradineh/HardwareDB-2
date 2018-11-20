<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Hardware Usage  List Page</title>
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<div class="container"></div>
	<hr>
	<div class="container w-50 mx-auto">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Usage Department</th>
					<th>Usage Date</th>
					<th>Usage Numbers</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${hardwares_usage}" var="hw">
					<tr>
						<td>${hw.department}</td>
						<td><fmt:formatDate value="${hw.usage_date}" pattern="yyyy/MM/dd"/></td>
						<td>${hw.numbers}</td>
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