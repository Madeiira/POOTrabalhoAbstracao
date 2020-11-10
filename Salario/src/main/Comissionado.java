package main;

public class Comissionado extends Empregado{
 
	private double totalVendas;
	private double taxaComissao = 0.2;
	
	public Comissionado(double totalVendas) {
		
		this.totalVendas = totalVendas;


	}
	
	public double Vencimento() {
		
		return totalVendas * taxaComissao;
	
	}
	
	String getCpf() {
		return "343.451.231-89";
	}
	
	String getSobrenome() {
		return "Long";
	}
	
	String getNome() {
		return "Joana";
	}
}
