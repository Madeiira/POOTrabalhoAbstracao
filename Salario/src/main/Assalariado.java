package main;

public class Assalariado extends Empregado {

	private double Salario;

	public Assalariado(double Salario) {

		this.Salario = Salario;
	}

	public double Vencimento() {

		return Salario;
	}

	protected String getCpf() {
		return cpf;
	}

	String getSobrenome() {
		return sobrenome;
	}

	String getNome() {
		return nome;
	}

	String setCpf(String cpf) {

		return this.cpf = cpf;

	}

	String setSobrenome(String sobrenome) {

		return this.sobrenome = sobrenome;

	}

	String setNome(String nome) {

		return this.nome = nome;

	}
}
