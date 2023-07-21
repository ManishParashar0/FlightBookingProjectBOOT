package com.manish.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}