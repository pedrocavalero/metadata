package net.sf.esfinge.metadata.validate.method.test;

import net.sf.esfinge.metadata.annotation.validator.method.OneAnnotationWithFinalMethodOnly;

public class PersonWithErrorFinalMethodOnly extends Person{
	
	private int notStaticValue = 42;	
	
	protected String oneProtectedString;	
		
	
	public PersonWithErrorFinalMethodOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithFinalMethodOnly
	public int getNotStaticValue() {
		return notStaticValue;
	}
	
	@OneAnnotationWithFinalMethodOnly
	public void setNotStaticValue(int notStaticValue) {
		this.notStaticValue = notStaticValue;
	}	
}
