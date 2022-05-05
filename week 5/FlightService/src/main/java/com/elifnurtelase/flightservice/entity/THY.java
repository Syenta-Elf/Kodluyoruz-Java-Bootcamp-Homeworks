package com.elifnurtelase.flightservice.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class THY extends Plane{

    public THY() {
        super("THY", 100L, 100L);
    }

}
