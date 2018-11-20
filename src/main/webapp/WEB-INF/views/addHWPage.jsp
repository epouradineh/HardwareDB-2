<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
<title>ADD/EDIT Hardware</title>
</head>
<body>

<div class="container w-50 mx-auto">
	<form:form method="post" modelAttribute="hardware" class="form-group">
		Hardware Type :<form:select path="hwtype" items="${hwtype}" class="form-control"/><br>
		Hardware Brand :<form:input path="brand" class="form-control"/><br>
		Hardware Model :<form:input path="model" class="form-control"/>	<br>
		Number of Hardware :<form:input path="numbers" class="form-control"/>
				<form:errors path="numbers" cssClass="text-warning"/><br>
		<input type="submit" value="ADD Hardware" class="btn btn-success"/>
	</form:form>
<a type="button" class="btn btn-success" href="/">Go to Home Page</a>
</div>
<script type="text/javascript" src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
</body>
</html>