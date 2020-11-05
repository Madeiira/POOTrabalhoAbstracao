package main;

public class Presidente extends Funcionario {
 
	private double Salario;
	private String Cargo = "Presidente";
	private double Bonificacao = 0.3;

	public Presidente (double Salario){
	    this.Salario = Salario;
		
		
	}
	public String getCargo() {

		 return this.Cargo;
	}

	
	public double getSalario() {
		
		return this.Salario;
	}

	double getBonificacao() {
		
		return (this.Salario * this.Bonificacao) + this.Salario;
	}




}
