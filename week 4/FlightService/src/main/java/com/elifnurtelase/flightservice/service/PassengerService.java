package com.elifnurtelase.flightservice.service;

import com.elifnurtelase.flightservice.entity.dto.PassengerDto;

import java.util.List;

public interface PassengerService {
    PassengerDto savePassenger(PassengerDto passenger);

    PassengerDto findPassengerById(Long passengerId);

    List<PassengerDto> findAllPassenger();
}
