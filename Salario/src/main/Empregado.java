package main;

public abstract class Empregado {

	protected String nome;
	protected String sobrenome;
	protected String cpf;

	
	abstract String  getCpf();
	
	abstract String getSobrenome();
	
	abstract String getNome();
	
	
	  public abstract double Vencimento();
	  

}
