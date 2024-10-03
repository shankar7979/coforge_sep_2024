package com.coforge.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @GeneratedValue
    @Id
    private int personId;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Phone phone;

}
