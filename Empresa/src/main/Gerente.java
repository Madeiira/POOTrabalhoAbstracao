package main;

public class Gerente extends Funcionario {
	
	protected double Salario;
	protected String Cargo = "Gerente";
	protected double Bonificacao = 0.2;

	public Gerente (double Salario){
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
