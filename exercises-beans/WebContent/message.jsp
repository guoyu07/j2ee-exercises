<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Message</title>
</head>
<jsp:useBean id="colorPreference" class="servletBeans.ColorBean" scope="application"></jsp:useBean>
<jsp:setProperty property="*" name="colorPreference"/>
<body bgcolor="<jsp:getProperty property="backgroundColor" name="colorPreference"/>" text='<jsp:getProperty property="foregroundColor" name="colorPreference"/>'>
<h1>Message</h1>
</body>
</html>