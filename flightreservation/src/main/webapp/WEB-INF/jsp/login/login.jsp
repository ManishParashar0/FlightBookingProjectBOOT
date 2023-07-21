<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login</title>
</head>
<body>
<h2>Login:</h2>
<form action="login" method="get">
<pre>
User Email:<input type="text" name="email"/>
Password:<input type="password" name="password"/>
<input type="submit" value="login"/> 
${msg}
</pre>
</form>
</body>
</html>