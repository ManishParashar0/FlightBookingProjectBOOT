package com.gufran.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gufran.flightreservation.dto.ReservationRequest;
import com.gufran.flightreservation.entities.Flight;
import com.gufran.flightreservation.entities.Reservation;
import com.gufran.flightreservation.repos.FlightRepository;
import com.gufran.flightreservation.services.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {

		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);

		return "completeReservation";

	}

	@RequestMapping(value = "/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and the id is " + reservation.getId());
		return "reservationConfirmation";

	}

}