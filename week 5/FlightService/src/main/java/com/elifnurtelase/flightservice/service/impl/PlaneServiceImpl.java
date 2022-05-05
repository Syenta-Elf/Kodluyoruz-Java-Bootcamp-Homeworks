package com.elifnurtelase.flightservice.service.impl;

import com.elifnurtelase.flightservice.dto.PlaneDto;
import com.elifnurtelase.flightservice.entity.Plane;
import com.elifnurtelase.flightservice.repository.PlaneRepository;
import com.elifnurtelase.flightservice.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaneServiceImpl implements PlaneService {
    private final PlaneRepository planeRepository;
    private final ModelMapper modelMapper;

    @Override
    public PlaneDto findPlaneById(Long id) {
        Optional<Plane> plane = planeRepository.findById(id);
        if(plane.isPresent())
        return modelMapper.map(plane.get(),PlaneDto.class);
        
        throw new IllegalCallerException("Kayıtta bu id'ye sahip bir uçak  yok.");
    }
}
