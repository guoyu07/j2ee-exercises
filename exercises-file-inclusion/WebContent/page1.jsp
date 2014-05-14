<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Page 1</title>
</head>
<%@ include file="/WEB-INF/includes/get-color.jsp" %>
<body bgcolor="<%= bgColor %>">
<h1>Page 1</h1>
<a href="page2.jsp">Go to Page2</a>
<jsp:include page="/WEB-INF/includes/signature.jsp"></jsp:include>
</body>
</html>