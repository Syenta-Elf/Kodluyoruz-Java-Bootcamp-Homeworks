package com.elifnurtelase.flightservice.repository;

import com.elifnurtelase.flightservice.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
