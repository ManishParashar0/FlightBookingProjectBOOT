package com.manish.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.flightreservation.dto.ReservationRequest;
import com.manish.flightreservation.entities.Flight;
import com.manish.flightreservation.entities.Passenger;
import com.manish.flightreservation.entities.Reservation;
import com.manish.flightreservation.repos.FlightRepository;
import com.manish.flightreservation.repos.PassengerRepository;
import com.manish.flightreservation.repos.ReservationRepository;
import com.manish.flightreservation.util.EmailUtil;
import com.manish.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		// Make Payment
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();

		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepository.save(reservation);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String filePath = "D:\\" + savedReservation.getId() + ".pdf";
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		pdfGenerator.generateItinerary(savedReservation, filePath);

		System.err.println(passenger.getEmail());
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		return savedReservation;
	}

}