package com.elifnurtelase.flightservice.api;

import com.elifnurtelase.flightservice.dto.PlaneDto;
import com.elifnurtelase.flightservice.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plane")
@RequiredArgsConstructor
public class PlaneController {
    private final PlaneService planeService;

    @GetMapping("/getPlaneById")
    public ResponseEntity<PlaneDto>getPlaneById(@RequestParam Long planeId){
        PlaneDto planeDto = planeService.findPlaneById(planeId);
        return ResponseEntity.ok(planeDto);
    }
}
