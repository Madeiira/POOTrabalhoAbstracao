package main;

public abstract class Empregado {

	protected String nome;
	protected String sobrenome;
	protected String cpf;

	abstract String getCpf();

	abstract String getSobrenome();

	abstract String getNome();

	abstract String setCpf(String cpf);

	abstract String setSobrenome(String sobrenome);

	abstract String setNome(String nome);

	public abstract double Vencimento();

}
