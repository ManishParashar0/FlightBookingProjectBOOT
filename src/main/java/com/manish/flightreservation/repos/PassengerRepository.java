package com.manish.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}