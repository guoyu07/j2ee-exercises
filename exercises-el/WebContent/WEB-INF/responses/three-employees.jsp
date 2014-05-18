<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Three Employees</title>
</head>
<body>
	<h1>Three Employees</h1>
	<div>
		<h2>${employees[0].name.lastName}, ${employees[0].name.firstName}</h2>
		<p>
			${employees[0].address.street}<br>
			${employees[0].address.zipCode} ${employees[0].address.city}
		</p>
	</div>
	<div>
		<h2>${employees[1].name.lastName}, ${employees[1].name.firstName}</h2>
		<p>
			${employees[1].address.street}<br>
			${employees[1].address.zipCode} ${employees[1].address.city}
		</p>
	</div>
	<div>
		<h2>${employees[2].name.lastName}, ${employees[2].name.firstName}</h2>
		<p>
			${employees[2].address.street}<br>
			${employees[2].address.zipCode} ${employees[2].address.city}
		</p>
	</div>
</body>
</html>