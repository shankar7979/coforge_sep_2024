package com.coforge.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToOne
    private Address address;
}
/*

@Data=@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
 */