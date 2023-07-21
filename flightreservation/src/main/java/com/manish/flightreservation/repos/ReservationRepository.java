package com.gufran.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gufran.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}