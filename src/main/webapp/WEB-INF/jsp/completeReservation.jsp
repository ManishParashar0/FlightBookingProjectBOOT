<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Complete Reservation</title>
  <style>
   
     body {
      font-family: Arial, sans-serif;
      font-size :18px;
      line-height: 1.6;
      max-width: 600px;
      margin: 0 auto;
      padding: 20px;
      /* Add the background image property */
      background-image: url('https://cdn.pixabay.com/photo/2019/06/27/06/49/plane-4301615_640.png');
      /* Set background image size to cover the entire body */
      background-size: cover;
      /* Set background image to fixed to prevent scrolling with content */
      background-attachment: fixed;
    }

    h2 {
      color: #007bff;
    }

    form {
      border: 1px solid #ccc;
      padding: 20px;
      background-color: #f7f7f7;
    }

    input[type="text"] {
      width: 100%;
      padding: 8px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    input[type="submit"] {
      background-color: #007bff;
      color: #fff;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }

    pre {
      white-space: pre-wrap;
    }
  </style>
</head>
<body>
  <h2>Complete Reservation</h2>
  Airline: ${flight.operatingAirlines}<br/>
  Departure City: ${flight.departureCity}<br/>
  Arrival City: ${flight.arrivalCity}<br/>

  <form action="completeReservation">
    <pre>
      <h2>Passenger Details:</h2>
      First Name: <input type="text" name="passengerFirstName"/>
      Last Name: <input type="text" name="passengerLastName"/>
      Email: <input type="text" name="passengerEmail"/>
      Phone: <input type="text" name="passengerPhone"/>

      <h2>Card Details:</h2>
      Name on the card: <input type="text" name="nameOnTheCard"/>
      Card No: <input type="text" name="cardNumber"/>
      Expiry Date: <input type="text" name="expirationDate"/>
      Three Digit Sec Code: <input type="text" name="securityCode"/>

      <input type="hidden" name="flightId" value="${flight.id}"/>
      <input type="submit" value="Confirm"/>
    </pre>
  </form>
</body>
</html>
