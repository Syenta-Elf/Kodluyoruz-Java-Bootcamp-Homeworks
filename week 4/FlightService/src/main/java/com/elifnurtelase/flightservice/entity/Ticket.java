package com.elifnurtelase.flightservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ticket")
@Data
public class Ticket extends BaseEntity{
    @Id
    @SequenceGenerator(name = "ticket_gen",
            sequenceName = "ticket_seq_gen",
            allocationSize = 100,
            initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ticket_gen")
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "plane_id")
    private Plane plane;

    @Column(name="isBussiness")
    private boolean isBussiness;

    @Column(name="fare")
    private Long fare;
}


