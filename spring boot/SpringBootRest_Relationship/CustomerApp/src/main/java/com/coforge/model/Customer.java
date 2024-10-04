package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long customerId;
    private String customerName;
    private LocalDate customerDob;

}
