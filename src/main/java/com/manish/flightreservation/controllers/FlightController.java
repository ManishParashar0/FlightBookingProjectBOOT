package com.manish.flightreservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manish.flightreservation.entities.Flight;
import com.manish.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") String date, ModelMap modelMap) {
		System.out.println(from + " " + to + "  " + "   " + date);

		List<Flight> flights = flightRepository.findFlights(from, to, date);
		System.out.println(flights);
		modelMap.addAttribute("flights", flights);
		return "displayFlights";

	}

}