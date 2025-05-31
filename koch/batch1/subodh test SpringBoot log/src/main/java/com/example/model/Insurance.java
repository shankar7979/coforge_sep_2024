package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Insurance {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int insuranceId;
	private String insuranceName;
	private int  years;
	private LocalDate startDate;

}
