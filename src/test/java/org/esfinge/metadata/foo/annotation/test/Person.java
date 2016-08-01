package org.esfinge.metadata.foo.annotation.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.esfinge.metadata.foo.annotation.FieldVisibilityForbidden;
import org.esfinge.metadata.foo.annotation.FieldVisibilityRequired;
import org.esfinge.metadata.foo.annotation.ValidFieldTypes;
import org.esfinge.metadata.foo.annotation.fieldonly.FinalFieldOnly;
import org.esfinge.metadata.foo.annotation.fieldonly.InstanceFieldOnly;
import org.esfinge.metadata.foo.annotation.fieldonly.StaticFieldOnly;
import org.esfinge.metadata.foo.annotation.fieldonly.TransientFieldOnly;
import org.esfinge.metadata.foo.annotation.fieldonly.VolatileFieldOnly;

public class Person {
	
	@FieldVisibilityForbidden(itCannotHaveThisVisibility = "public")
	@ValidFieldTypes(listValidTypes = { "String" })
	private String name;
	@FieldVisibilityRequired(itNeedsToHaveThisVisibility = "private")
	private String cpf;
	
	@InstanceFieldOnly
	@ValidFieldTypes(listValidTypes = { "int", "Integer" })
	private int age;	
	
	@StaticFieldOnly
	private static String staticValue = "";		
	@FinalFieldOnly
	private final String finalValue = "";	
	@TransientFieldOnly
	private transient String transientValue = "";	
	@VolatileFieldOnly
	private volatile String volatileValue = "";
	
	@ValidFieldTypes(listValidTypes = { "List" })	
	private List<Integer> someList = new LinkedList<Integer>();
	
	@ValidFieldTypes(listValidTypes = { "List" })	
	private ArrayList<Float> otherList = new ArrayList<Float>();
	
//	private synchronized String synchronizedValue = "";
			
	public Person(String name, String cpf, int age) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getSomeList() {
		return someList;
	}
	public void setSomeList(List<Integer> someList) {
		this.someList = someList;
	}	
	
}
