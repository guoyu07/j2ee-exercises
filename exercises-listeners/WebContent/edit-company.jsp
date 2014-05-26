<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Edit company</title>
</head>
<body>
<h1>Edit company</h1>
<form action="edit-company" method="post">
	<input type="text" name="companyName" value="${companyName}">
	<input type="submit">
</form>
</body>
</html>