package org.esfinge.metadata.TestAnottation;


@Entidade
@Tabela(nome="dominio")
public class Dominio {
	
	private String field1;
	
	@FieldLista
	private int field2;
	
	public void entidade1(){}
	
	@Proces
	public void entidade2(){}

}
