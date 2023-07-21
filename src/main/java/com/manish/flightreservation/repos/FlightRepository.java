package com.manish.flightreservation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manish.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query(value = "from Flight where departure_city=:departure_city and arrival_city=:arrival_city and date_of_departure=:date_of_departure")
	List<Flight> findFlights(@Param("departure_city") String from, @Param("arrival_city") String to,
			@Param("date_of_departure") String date);
}