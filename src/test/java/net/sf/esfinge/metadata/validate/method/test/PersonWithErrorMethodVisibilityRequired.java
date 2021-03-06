package net.sf.esfinge.metadata.validate.method.test;

import net.sf.esfinge.metadata.annotation.validator.method.OneAnnotationWithMethodVisibilityRequired;

public class PersonWithErrorMethodVisibilityRequired extends Person{
		
	protected String oneProtectedString;	
	
	public static String otherStaticString = "";

	
	public PersonWithErrorMethodVisibilityRequired(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithMethodVisibilityRequired
	public String getOneProtectedString() {
		return oneProtectedString;
	}
	
	@OneAnnotationWithMethodVisibilityRequired
	public static String getOtherStaticString() {
		return otherStaticString;
	}
	
}
