<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<%
		out.println("Welcome to JSP API");
		String name = "Paul";
		
		session.setAttribute("username", name);
		
		if(name.equals("")){
	%>
			<p>You don't have a name</p>
	<%
		}else{
	%>
			<p>Hi <%=name%></p>
	<%
		}
	%>
</body>
</html>