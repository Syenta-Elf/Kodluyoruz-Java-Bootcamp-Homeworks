package com.elifnurtelase.flightservice.api;

import com.dto.PassengerDto;
import com.elifnurtelase.flightservice.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/passenger")
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;

    //Yolcuları Repository'e kaydediyor.
    @PostMapping("/savePassenger")
    public ResponseEntity<PassengerDto>savePassenger(@RequestBody PassengerDto passenger){
        PassengerDto resultPassenger = passengerService.savePassenger(passenger);
        return ResponseEntity.ok(resultPassenger);
    }
    //Id'ye göre yolcu buluyor.
    @GetMapping("/findPassengerById/{id}")
    public ResponseEntity<PassengerDto>findPassengerById(@PathVariable("id") Long id){
        PassengerDto resultPassenger = passengerService.findPassengerById(id);
        return ResponseEntity.ok(resultPassenger);
    }
    //Tüm yolcuların bilgilerini geri döndürüyor.
    @GetMapping("/findAllPassengers")
    public ResponseEntity<List<PassengerDto>>findAllPassengers(){
        List<PassengerDto> passengersDto=passengerService.findAllPassenger();
        return ResponseEntity.ok(passengersDto);
    }


}
