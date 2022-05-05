package com.elifnurtelase.flightservice.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Pegasus extends Plane{
    public Pegasus() {
        super("Pegasus", 75L, 90L);
    }
}
