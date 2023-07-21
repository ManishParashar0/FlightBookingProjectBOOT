package com.gufran.flightreservation.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gufran.flightreservation.entities.Flight;
import com.gufran.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate")  String date,
			ModelMap modelMap)  {
		System.out.println(from+"" +to+""+""+ date);
		//Date departureDate =  new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH).parse(date);
		//flightRepository.findFlights(from, to, departureDate);
		List<Flight> flights = flightRepository.findFlights(from, to, date);
		System.out.println(flights);
		modelMap.addAttribute("flights", flights);
		return "displayFlights";

	}

}