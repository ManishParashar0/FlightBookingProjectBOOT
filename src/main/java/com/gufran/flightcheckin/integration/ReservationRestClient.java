package com.gufran.flightcheckin.integration;

import com.gufran.flightcheckin.integration.dto.Reservation;
import com.gufran.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}