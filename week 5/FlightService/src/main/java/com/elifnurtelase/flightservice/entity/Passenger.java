package com.elifnurtelase.flightservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="PASSENGER")
@Data
@Embeddable
public class Passenger extends BaseEntity{
    @Id
    @SequenceGenerator(name="pass_seq_gen",
                        sequenceName = "pass_gen",
                        allocationSize = 100,
                        initialValue = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "pass_seq_gen")
    @Column(name="ID")
    private Long id;

    @Column(name = "FIRSTNAME")
    private String passengerFirstName;

    @Column(name="LASTNAME")
    private String passengerLastName;

}
