package com.manish.flightreservation.services;

import com.manish.flightreservation.dto.ReservationRequest;
import com.manish.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}