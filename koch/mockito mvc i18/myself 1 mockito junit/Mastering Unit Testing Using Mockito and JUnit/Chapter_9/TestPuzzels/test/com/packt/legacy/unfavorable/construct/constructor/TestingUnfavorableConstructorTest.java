package com.packt.legacy.unfavorable.construct.constructor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestingUnfavorableConstructorTest {
	@Mock DatabaseDependency dep1;
	@Mock FileReadDependency dep2;
	
	TestingUnfavorableConstructor unfavorableConstructor;
	
	@Before
	public void setUp() {
		unfavorableConstructor= new TestingUnfavorableConstructor() {
			protected void createDependencies() {
			}
		};

		unfavorableConstructor.setDependency1(dep1);
		unfavorableConstructor.setDependency2(dep2);
	}
	
	@Test
	public void sanity() throws Exception {
		
	}

}
