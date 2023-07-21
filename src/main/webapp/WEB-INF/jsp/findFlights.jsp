<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Find Flights</title>
<style type="text/css">body {
  font-family: Arial, sans-serif;
  background-image: url('https://media.istockphoto.com/id/1057080790/photo/colorful-bright-sunset-with-flying-airplane-silhouette.webp?b=1&s=612x612&w=0&k=20&c=01yN5xjS1IjAbK-sdkEQFj6FY-nDdik4lHT1Z7VVNZA=');
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
}

input[type="text"],
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
<h2>Find FLights:</h2>
<form action="findFlights" method="post">
From:<input type="text" name="from"/>
To:<input type="text" name="to"/>
Departure Date:<input type="text" name="departureDate"/>
<input type="submit" value="search"/>
</form>
</body>
</html>