package com.elifnurtelase.flightservice.repository;

import com.elifnurtelase.flightservice.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane,Long> {
    
}
