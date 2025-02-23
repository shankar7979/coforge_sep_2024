package com.narayanatutorial.SpringBootProfileExample;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.narayanatutorial.service.VehicleBrand;


@SpringBootTest
@ActiveProfiles("Honda")
public class HondaTest {
	
	@Autowired
	VehicleBrand vehicleBrand;
	
	@Test
	public void testVahicleName() {
		String vehicalName=vehicleBrand.getVehiclName();
		assertThat(vehicalName).contains("Honda");
	}

}
/*
ActiveProfiles is a class-level annotation that is used to declarewhich active bean definition profiles should be used when loadingan ApplicationContextfor test classes. 

*/