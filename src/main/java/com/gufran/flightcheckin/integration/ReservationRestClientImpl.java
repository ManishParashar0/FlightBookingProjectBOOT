package com.gufran.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gufran.flightcheckin.integration.dto.Reservation;
import com.gufran.flightcheckin.integration.dto.ReservationUpdateRequest;
@Component
public class ReservationRestClientImpl implements ReservationRestClient {
	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservations/";
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate
				.getForObject(RESERVATION_REST_URL + id, Reservation.class);
		return reservation;
	}

	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;
	}
}