package main;

public  class Diretor extends  Gerente {
	
	
	
	public Diretor(double Salario) {
		super(Salario);
	}

	public String getCargo() {

		 return this.Cargo="Diretor";
	}
	
	public double getSalario() {
		
		return this.Salario;
	}

	double getBonificacao() {
		
		return (this.Salario * this.Bonificacao) + this.Salario;
	}
}
