package com.elifnurtelase.flightservice.entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PLANES")
@Data
@RequiredArgsConstructor

public abstract class Plane extends BaseEntity {

    public Plane(String planeName,Long fare,Long capacity){
        setPlaneName(planeName);
        setFare(fare);
        setCapacity(capacity);
    }

    @Id
    @SequenceGenerator(name = "plane_gen",
                        sequenceName = "plane_seq_gen",
                        allocationSize = 100,
                        initialValue = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "plane_gen")
    @Column(name="id")
    private Long planeId;

    @Column(name="Name")
    private String planeName;

    @Column(name="Fare")
    private Long fare;

    @Column(name = "Capacity")
    private Long capacity;


}
