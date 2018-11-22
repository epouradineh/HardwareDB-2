<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<link rel="stylesheet"
	href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Hardware Usage</title>
</head>
<body>

	<div class="container">
		<table class="table table-striped">
			<tr>
				<th>Hardware Type</th>
				<th>Hardware Brand</th>
				<th>Hardware Model</th>
				<th>Hardware Numbers</th>
			</tr>
			<tr>
				<td>${hardware.hwtype}</td>
				<td>${hardware.brand}</td>
				<td>${hardware.model}</td>
				<td>${hardware.numbers}</td>
			</tr>
		</table>
	</div>
		<hr>
	<div class="container">
		<h2>Usage Information</h2>
		<form:form modelAttribute="hardware_usage" class="form-group  w-50">
			<form:hidden  path="hardware_id" />
			<form:label path="department">Department</form:label>
				<form:select path="department" items="${departments}" class="form-control" />
			<form:label path="usage_date">Usage Date</form:label>
				<form:input path="usage_date" class="form-control" ></form:input>
			<form:label path="numbers">Number Of Usage</form:label>
				<form:input path="numbers" class="form-control" />
				<form:errors path="numbers" cssClass="text-warning"/><br>
			<form:button  type="submit" class="btn btn-success" name="submit" >Use </form:button>
		</form:form><br>
		<div class="container"><a type="butten" class="btn btn-success" href="/hwList">Back to Hardware List</a></div><br>
		<div class="container"><a type="butten" class="btn btn-success" href="/hwUsageList">Back to Hardware Usage List</a></div><br>
		<div class="container"><a type="button" class="btn btn-success" href="/">Go to Home Page</a></div><br>
		
		
		
	</div>
	<script type="text/javascript" src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script type="text/javascript" src="webjars/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>
	<script >	$('#usage_date').datepicker({format:'yyyy/mm/dd'});	</script>
</body>
</html>