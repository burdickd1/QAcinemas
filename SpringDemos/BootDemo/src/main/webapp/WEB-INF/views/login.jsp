<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Person: [name=" + lastname + ", " + firstname + " email=" + email + " age=" + age + "]" -->
	
	<form action="/" method="post">
		First name: <input type="text" name="firstname"/>
		<br/>
		Last name: <input type="text" name="lastname"/>
		<br/>
		email: <input type="email" name="email"/>
		<br/>
		Age: <input type="number" name="age"/>
		&nbsp;
		
		<input type="submit" />
	</form>
</body>
</html>