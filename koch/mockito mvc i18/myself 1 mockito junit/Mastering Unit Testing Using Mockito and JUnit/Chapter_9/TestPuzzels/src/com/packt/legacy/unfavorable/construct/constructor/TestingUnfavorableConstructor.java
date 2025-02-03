package com.packt.legacy.unfavorable.construct.constructor;

public class TestingUnfavorableConstructor {
	 private DatabaseDependency dependency1;
	 private FileReadDependency dependency2;
	 
	public TestingUnfavorableConstructor() {
		createDependencies();
	}

	protected void createDependencies() {
		this.dependency1 = new DatabaseDependency();
		this.dependency2 = new FileReadDependency();
	}
	 
	public void setDependency1(DatabaseDependency dependency1) {
		this.dependency1 = dependency1;
	}

	public void setDependency2(FileReadDependency dependency2) {
		this.dependency2 = dependency2;
	}

	public Object testMe(Object arg) {
		return arg;
	}
}
