<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" import="java.math.*" %>
<% 
String param = request.getParameter("number");
BigInteger number = new BigInteger(param);
BigInteger square = number.multiply(new BigInteger("2"));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>BigInt Square</title>
</head>
<body>
<h1><%= square %></h1>
</body>
</html>