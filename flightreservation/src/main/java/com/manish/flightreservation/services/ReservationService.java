package com.gufran.flightreservation.services;

import com.gufran.flightreservation.dto.ReservationRequest;
import com.gufran.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}