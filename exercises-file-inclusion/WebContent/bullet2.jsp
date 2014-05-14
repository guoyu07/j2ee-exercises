<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/includes/random-int.jsp" %>
<ul>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
	<li><%= RandomInt(12,100) %></li>
</ul>
</body>
</html>