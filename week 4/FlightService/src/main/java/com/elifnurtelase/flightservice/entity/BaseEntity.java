package com.elifnurtelase.flightservice.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    private String createdBy;


}
