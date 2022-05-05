package com.elifnurtelase.flightservice.service;

import com.elifnurtelase.flightservice.entity.dto.PlaneDto;

public interface PlaneService {
    PlaneDto findPlaneById(Long id);
}
