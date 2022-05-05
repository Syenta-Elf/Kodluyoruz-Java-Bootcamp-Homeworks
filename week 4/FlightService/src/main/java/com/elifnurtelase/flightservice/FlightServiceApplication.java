package com.elifnurtelase.flightservice;

import com.elifnurtelase.flightservice.entity.Pegasus;
import com.elifnurtelase.flightservice.entity.THY;
import com.elifnurtelase.flightservice.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FlightServiceApplication implements CommandLineRunner {
    //THY,Pegasus uçaklarını program ayağa kalkarken oluşturması için yazdım.
    @Autowired
    private PlaneRepository planeRepository;

    public static void main(String[] args) {SpringApplication.run(FlightServiceApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {
        THY planeTHY = new THY();
        Pegasus planePegasus = new Pegasus();
        planeTHY.setCreatedAt(new Date());
        planePegasus.setCreatedAt(new Date());
        planeRepository.save(planeTHY);
        planeRepository.save(planePegasus);
    }
}
