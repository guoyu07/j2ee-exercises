<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First Names</title>
</head>
<body>
<table>
<tr><th>First name</th><th>Last name</th></tr>
<c:forEach var="name" items="${names}" varStatus="status">
<c:if test="${status.first || status.last}"><c:set var="bgcolor" value="red"/></c:if>
<c:if test="${!status.first && !status.last}"><c:set var="bgcolor" value="white"/></c:if>
<tr bgcolor="${bgcolor}">
	<td>
	<c:choose>
		<c:when test="${name.firstName == 'Mickey'}">Mouseton</c:when>
		<c:when test="${name.firstName == 'Donald'}">Duckburg</c:when>
		<c:otherwise>${name.firstName}</c:otherwise>
	</c:choose>
	</td>
	<td>${name.lastName}</td>
</tr>
</c:forEach>
</table>
</body>
</html>