package cts.com.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EmployeeTest {

	@InjectMocks
	Employee employee;
	
	@Mock
	Address address;
	
	@BeforeEach
	public void init() {
		
		MockitoAnnotations.initMocks(this);
		employee=new Employee();
	}
	
	@Test
	public void test1() {
		employee.setAddress(address);
		Mockito.when(address.getCity()).thenReturn("kochi");
		Assertions.assertEquals("kochi", employee.getAddress().getCity());
		Mockito.verify(employee);
	}
}






//Mockito.verify(employee).getAddress().getCity();