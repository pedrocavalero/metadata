package org.esfinge.metadata.TestAnottation;

import java.util.Map;

import org.esfinge.metadata.container.AnnotationProperty;
import org.esfinge.metadata.container.ContainsAnnotation;
import org.esfinge.metadata.container.ElementName;
import org.esfinge.metadata.container.ReflectionReference;

public class CT7Container {
		
	@ElementName
	private String nomeClasse;
	
	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	

}
