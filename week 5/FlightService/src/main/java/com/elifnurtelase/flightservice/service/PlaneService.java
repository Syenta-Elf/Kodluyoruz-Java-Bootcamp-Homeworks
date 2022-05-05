package com.elifnurtelase.flightservice.service;

import com.elifnurtelase.flightservice.dto.PlaneDto;

public interface PlaneService {
    PlaneDto findPlaneById(Long id);
}
