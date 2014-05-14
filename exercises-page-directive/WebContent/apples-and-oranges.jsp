Year	Apples	Oranges
2012	<%= getRandNum() %>	<%= getRandNum() %>
2013	<%= getRandNum() %>	<%= getRandNum() %>
<%@ page contentType="application/vnd.ms-excel" import="java.lang.*" %>

<%! private double getRandNum() {
	return Math.random() *  10;
}%>
<% response.setHeader( "Content-Disposition", "attachment;filename=AppleAndOrangesRand.xls"); %>