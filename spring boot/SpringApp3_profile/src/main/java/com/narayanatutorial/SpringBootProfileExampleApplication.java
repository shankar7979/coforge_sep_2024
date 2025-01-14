package com.narayanatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

import com.narayanatutorial.service.VehicleBrand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
//(scanBasePackages = {"com.narayanatutorial.service"})

public class SpringBootProfileExampleApplication implements CommandLineRunner{

	@Autowired
	VehicleBrand vehicleBrand;
	
	public static void main(String[] args) {
	
//		SpringApplication.run(SpringBootProfileExampleApplication.class, args);
	
		SpringApplication springApp = new SpringApplication(SpringBootProfileExampleApplication.class);
//		springApp.setAdditionalProfiles("dev");
		springApp.setAdditionalProfiles("default");
		springApp.run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		//		SpringApplication.setAdditionalProfiles("dev");


	//	System.out.println("vehicleBrand is "+vehicleBrand);
		String vehicaleName=vehicleBrand.getVehiclName();
		System.out.println("Vehical Name:"+vehicaleName);
	}

}
/*
  @Profiles
 
Indicates that a component is eligible for registration when one or more specified profiles are active. 

A profile is a named logical grouping that may be activated programmatically via ConfigurableEnvironment.setActiveProfiles or declarativelyby setting the spring.profiles.active property as a JVM system property, as anenvironment variable, or as a Servlet context parameter in web.xmlfor web applications. Profiles may also be activated declaratively inintegration tests via the @ActiveProfiles annotation

so it is done by testing only using 
@ActiveProfiles("Honda")


*/