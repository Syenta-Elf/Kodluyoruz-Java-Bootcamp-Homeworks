package com.elifnurtelase.flightservice.service.impl;

import com.dto.PassengerDto;
import com.elifnurtelase.flightservice.entity.Passenger;
import com.elifnurtelase.flightservice.repository.PassengerRepository;
import com.elifnurtelase.flightservice.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;
    private final ModelMapper modelMapper;

    @Override
    public PassengerDto savePassenger(PassengerDto passengerDto) {
        Passenger passenger = modelMapper.map(passengerDto,Passenger.class);
        passenger.setCreatedAt(new Date());
        return modelMapper.map(passengerRepository.save(passenger),PassengerDto.class);
    }

    @Override
    public PassengerDto findPassengerById(Long passengerId) {
        Optional<Passenger> optionalPassenger = passengerRepository.findById(passengerId);
        PassengerDto passengerDto = modelMapper.map(optionalPassenger.get(),PassengerDto.class);
        return passengerDto;
    }

    @Override
    public List<PassengerDto> findAllPassenger() {
        List<Passenger> passengers = passengerRepository.findAll();
        List<PassengerDto> passengersDto = passengers.stream().map(passenger -> modelMapper.map(passenger,PassengerDto.class)).collect(Collectors.toList());
        return passengersDto;
    }


}
