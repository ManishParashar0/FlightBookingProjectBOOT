<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login</title>
<style type="text/css">
body {
  font-family: Arial, sans-serif;
  background-image: url('https://cdn.pixabay.com/photo/2016/04/07/17/49/aircraft-1314335_640.png');
  background-size: cover;
  background-position: center;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction:column;
  height: 100vh;
}

.container {
   background-color:white;
  max-width: 400px;
  padding: 20px;
  background-color: rgba(255, 255, 255, 0.9);
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
}

h2 {
  color: #007BFF;
  text-align: center;
  margin-bottom: 20px;
}

form {
  text-align: center;
}

pre {
  margin: 0;
}

input[type="text"],
input[type="password"],
input[type="submit"] {
  margin: 5px;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

input[type="submit"] {
  background-color: #007BFF;
  color: #fff;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: #0056b3;
}
form{
	background:white;
	padding:20px;
	border-radius:5px;
}
</style>
</head>
<body>
<h2>Login:</h2>
<form action="login" method="get">

<label>User Email:</label><input type="text" name="email"/>
<label>Password:</label><input type="password" name="password"/>
<input type="submit" value="login"/> 
${msg}
</form>
</body>
</html>