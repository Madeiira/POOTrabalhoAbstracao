package main;

public class Comissionado extends Empregado {

	private double totalVendas;
	private double taxaComissao = 0.2;

	public Comissionado(double totalVendas) {

		this.totalVendas = totalVendas;

	}

	public double Vencimento() {

		return totalVendas * taxaComissao;

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

		return this.nome = nome;

	}
}
