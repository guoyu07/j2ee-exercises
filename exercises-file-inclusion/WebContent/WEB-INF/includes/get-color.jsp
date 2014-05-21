<%
String bgColor = request.getParameter("bgcolor");
if(bgColor == null || bgColor.trim().isEmpty()) {
	bgColor = "WHITE";
}
%>
<%= bgColor %>