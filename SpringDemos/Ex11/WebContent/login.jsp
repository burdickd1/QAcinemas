<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="text/javascript" src="js/login.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please log in</h1>
	<form action="" method="get">
		<table align="center">
			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Password: </td>
				<td><input type="password" name="pswd"/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" onclick="" value="Submit"/>
				</td>
				<td>
					<input type="reset" value="Reset"/>
				</td>
			</tr>
			<tr>
				<td>New User?&nbsp;&nbsp;</td>
				<td><input type="button" id="regButt" onclick="register()" value="Register"/></td>
			</tr>
		</table>
	</form>
</body>
</html>