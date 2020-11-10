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
		return "789.453.185-67";
	}
	
	String getSobrenome() {
		return "Nins";
	}
	
	String getNome() {
		return "Volado";
	}

}
