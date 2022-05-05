package com.elifnurtelase.flightservice.repository;

import com.elifnurtelase.flightservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
    List<Ticket> findTicketsById(Long id);
}
