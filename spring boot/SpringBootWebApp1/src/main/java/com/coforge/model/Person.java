package com.coforge.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Person {
	
	@NotNull(message = "id is bank")
	@Min(value = 5, message = "id must of minimum 10000 digit")
	@Max(value = 7, message = "id must of maximum 9999999 digit")
	private Integer id;
	

	@NotBlank(message = "name is blank")
	@Size(max = 20, min = 5, message = "name must of 5 - 20 character  ")
	private String name;
	
	@NotNull(message = "age is bank")
	@Min(value = 1, message = "age must of minimum 1 digit")
	@Max(value = 5, message = "age must of maximum 20 digit")
	private Integer age;	
	
}
