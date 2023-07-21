package com.manish.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manish.flightreservation.dto.ReservationRequest;
import com.manish.flightreservation.entities.Flight;
import com.manish.flightreservation.entities.Reservation;
import com.manish.flightreservation.repos.FlightRepository;
import com.manish.flightreservation.services.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		System.out.println("hello -----------error------------------");
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		System.out.println(flight);
		System.out.println("hello -----------error---------------12432343245433432432---");
		return "completeReservation";

	}

	@RequestMapping(value = "/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		System.err.println("helooosdfsfdhdgsjd88&*******************");
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and the id is " + reservation.getId());
		System.err.println("helooosdfsfdhdgsjd88&*******************");
		return "reservationConfirmation";

	}

}