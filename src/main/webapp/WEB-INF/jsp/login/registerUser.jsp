<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
<style type="text/css">body {
  font-family: Arial, sans-serif;
  background-image: url('https://cdn.pixabay.com/photo/2020/04/11/19/47/flying-flight-5031781_640.jpg');
  background-size: cover;
  background-position: center;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.container {
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
  border-top-color:red;
  border-radius: 90px;
  border-color: blue;
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
</style>
</head>
<body>
<h2>User Registration:</h2>
<form action="registerUser" method="post">
<pre>
First Name: <input type="text" name="firstName"/>
Last Name:  <input type="text" name="lastName"/>
User Email: <input type="text" name="email"/>
Password: <input type="password" name="password"/>
Confirm Password: <input type="password" name="confirmPassword"/>
<input type="submit" value="Register"/>
</pre>
</form>

</body>
</html>