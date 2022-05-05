package com.elifnurtelase.flightservice.service;

import com.dto.TicketDto;

public interface TicketService {
    TicketDto buyTicket(Long passengerId, Long planeId,boolean isBussiness);
    TicketDto refundTicket(Long ticketId);
}
