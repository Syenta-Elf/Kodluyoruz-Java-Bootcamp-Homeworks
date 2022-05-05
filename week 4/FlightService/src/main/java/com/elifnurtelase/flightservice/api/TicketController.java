package com.elifnurtelase.flightservice.api;

import com.elifnurtelase.flightservice.entity.dto.TicketDto;
import com.elifnurtelase.flightservice.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
@AllArgsConstructor
public class TicketController {
    private final TicketService ticketService;
    @PostMapping(value = "/buyTicket/{passengerId}/{planeId}")
    @ResponseBody
    public ResponseEntity<TicketDto> buyTicket(@PathVariable("passengerId") Long passengerId, @PathVariable Long planeId, @RequestParam boolean isBussiness){

        return ResponseEntity.ok(ticketService.buyTicket(passengerId,planeId,isBussiness));
    }

    @PostMapping("/refundTicket/{ticketId}")
    @ResponseBody
    public ResponseEntity<TicketDto>refundTicket(@PathVariable Long ticketId) {
        TicketDto ticketDto;
        ticketDto = ticketService.refundTicket(ticketId);
        return ResponseEntity.ok(ticketDto);

    }
}
