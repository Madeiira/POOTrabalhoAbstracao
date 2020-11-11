package main;

public class Horista extends Empregado {
	private double precoHora;
	private double horasTrabalhadas = 0.2;

	public Horista(double precoHora, double horasTrabalhadas) {

		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;

	}

	public double Vencimento() {

		return precoHora * horasTrabalhadas;

	}

	String getCpf() {
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
		// TODO Auto-generated method stub
		return this.nome = nome;
	}

}
