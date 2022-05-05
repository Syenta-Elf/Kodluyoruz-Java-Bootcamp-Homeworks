package com.elifnurtelase.flightservice.service.impl;

import com.elifnurtelase.flightservice.dto.TicketDto;
import com.elifnurtelase.flightservice.entity.Passenger;
import com.elifnurtelase.flightservice.entity.Plane;
import com.elifnurtelase.flightservice.entity.Ticket;
import com.elifnurtelase.flightservice.repository.PassengerRepository;
import com.elifnurtelase.flightservice.repository.PlaneRepository;
import com.elifnurtelase.flightservice.repository.TicketRepository;
import com.elifnurtelase.flightservice.service.TicketService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final PassengerRepository passengerRepository;
    private final PlaneRepository planeRepository;
    private final ModelMapper modelMapper;
    @Override
    public TicketDto buyTicket(Long passengerId, Long planeId,boolean isBussiness) {
        Optional<Passenger> passenger = passengerRepository.findById(passengerId);
        Plane plane = planeRepository.getById(planeId);
        List<Ticket> ticketList = ticketRepository.findTicketsById(planeId);

        if(passenger.isPresent())
        {
            if(ticketList.size()<=plane.getCapacity())
            {
                Ticket ticket = new Ticket();
                ticket.setCreatedAt(new Date());
                ticket.setCreatedBy("Admin");
                ticket.setBussiness(isBussiness);

                if(ticket.isBussiness())
                    ticket.setFare(plane.getFare()*(3/2));
                else
                    ticket.setFare(plane.getFare());

                ticket.setPassenger(passenger.get());
                ticket.setPlane(plane);
                ticketRepository.save(ticket);
                return modelMapper.map(ticket, TicketDto.class);
            }
            throw new IllegalArgumentException("Uçakta boş koltuk bulunamadı.");
        }
        throw new IllegalArgumentException("Yolcu kaydı bulunamadı");
    }

    @Override
    public TicketDto refundTicket(Long ticketId) {
        Optional<Ticket> ticket = ticketRepository.findById(ticketId);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,3);

        if(ticket.isPresent()){
            if(ticket.get().getCreatedAt().before(calendar.getTime()))
            {
                ticketRepository.delete(ticket.get());
                return modelMapper.map(ticket.get(),TicketDto.class);
            }else
                throw new IllegalArgumentException("İade süresi geçtiği için bilet iade edilemez.");
        }
        throw new IllegalCallerException("Bilet Bulunamadı");
    }
}