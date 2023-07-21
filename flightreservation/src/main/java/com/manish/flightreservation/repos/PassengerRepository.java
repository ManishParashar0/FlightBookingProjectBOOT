package com.gufran.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gufran.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}