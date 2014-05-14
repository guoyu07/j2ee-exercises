<%!
public long RandomInt(int min,int max) {
	return Math.round(min + (Math.random() * (max-min)));
}
%>