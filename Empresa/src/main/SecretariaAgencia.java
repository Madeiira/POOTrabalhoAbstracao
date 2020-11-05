package main;

public class SecretariaAgencia extends Secretaria{
 
	private double Salario;
	private String Cargo = "Secretária Agencia";
	private double Bonificacao = 0.05;

	public SecretariaAgencia (double Salario){
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
