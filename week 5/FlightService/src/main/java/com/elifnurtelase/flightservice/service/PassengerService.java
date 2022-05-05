package com.elifnurtelase.flightservice.service;

import java.util.List;

import com.elifnurtelase.flightservice.dto.PassengerDto;

public interface PassengerService {
    PassengerDto savePassenger(PassengerDto passenger);

    PassengerDto findPassengerById(Long passengerId);

    List<PassengerDto> findAllPassenger();
}
