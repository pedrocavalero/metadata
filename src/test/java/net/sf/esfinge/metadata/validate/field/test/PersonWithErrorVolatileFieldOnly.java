package net.sf.esfinge.metadata.validate.field.test;

import net.sf.esfinge.metadata.annotation.validator.field.OneAnnotationWithVolatileFieldOnly;

public class PersonWithErrorVolatileFieldOnly extends Person{
	
	@OneAnnotationWithVolatileFieldOnly
	transient String oneDefaultString;

	@OneAnnotationWithVolatileFieldOnly
	private static String oneStaticString = "";	
	
	public PersonWithErrorVolatileFieldOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}
