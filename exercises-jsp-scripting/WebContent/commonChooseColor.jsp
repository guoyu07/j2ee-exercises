<%@page import="utils.ColorUtils"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Common choose color</title>
</head>
<%! 
private String colorParamName = "color";
private String color = ColorUtils.randomColor();
%>

<%
String colorParam = request.getParameter(colorParamName);
if(colorParam != null && !colorParam.trim().equals("")) {
	color = colorParam;
}
%>
<body bgcolor="<%= color %>">
	<form method="post">
		<label for="color">Choose color</label>
		<input type="color" id="color" name="<%= colorParamName %>" value="<%= color %>">
		<input type="submit">
	</form>
</body>
</html>