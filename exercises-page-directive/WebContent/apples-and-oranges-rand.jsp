Year	Apples	Oranges
<% for(int i=0; i< getRandNum(); i++) { %><%= i %>	<%= getRandNum() %>	<%= getRandNum() %>
<% } %>
<%@ page contentType="application/vnd.ms-excel" import="java.lang.*" %>

<%! private double getRandNum() {
	return Math.random() *  10;
}%>
<% response.setHeader( "Content-Disposition", "attachment;filename=AppleAndOrangesRand.xls"); %>