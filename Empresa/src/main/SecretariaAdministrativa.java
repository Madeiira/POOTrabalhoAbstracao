package main;

public class SecretariaAdministrativa extends Secretaria{
 
	private double Salario;
	private String Cargo = "Secretária Administrativa";
	private double Bonificacao = 0.1;

	public SecretariaAdministrativa (double Salario){
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
