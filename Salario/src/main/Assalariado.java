package main;

public class Assalariado extends Empregado{

	private double Salario;
	
	public Assalariado(double Salario) {
		
		this.Salario = Salario;
	}


	


	
	public double Vencimento() {
		
	return Salario;
	}
	
	String getCpf() {
		return "123.545.132-15";
	}
	
	String getSobrenome() {
		return "Antonio";
	}
	
	String getNome() {
		return "Joao";
	}
}



