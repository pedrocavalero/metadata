package net.sf.esfinge.metadata.validate.method.test;

import net.sf.esfinge.metadata.annotation.validator.method.OneAnnotationWithValidNumberOfParameters;

public class PersonWithErrorValidNumberOfParameters extends Person{
	
	private static String oneStaticString = "";	
	
	
	public PersonWithErrorValidNumberOfParameters(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithValidNumberOfParameters
	public static String getOneStaticString() {
		return oneStaticString;
	}

	@OneAnnotationWithValidNumberOfParameters
	public static void setOneStaticString(String oneStaticString) {
		PersonWithErrorValidNumberOfParameters.oneStaticString = oneStaticString;
	}
}
