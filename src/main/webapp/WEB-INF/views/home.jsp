<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Home Page</title>
<link rel="stylesheet"
	href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<div class="container" align="center">
		<h1>Welcome Hardware Database Application</h1>
		<h3>You're Login as : ${loginUser}</h3>
	</div>
	<hr>
	<div class="container">
		<nav class="navbar bg-light">

			<!-- Links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/hwList">List
						Of Hardware</a></li>
				<li class="nav-item"><a class="nav-link" href="/addHW">Add
						New Hardware</a></li>
				<li class="nav-item"><a class="nav-link" href="/hwUsageList">List Of Usage Hardware</a></li>
				<li class="nav-item"><a class="nav-link" href="/about">About</a></li>
			</ul>

		</nav>
	</div>
	<script type="text/javascript"
		src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
</body>
</html>