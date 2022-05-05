package com.elifnurtelase.flightservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TicketDto{
    private  Date createdAt;
    private  Long id;
    private  PassengerDto passenger;
    private  PlaneDto plane;
    private Long fare;
}
