package main;

public class Circulo extends Forma{
	
	private double raio;
	private double pi = 3.14;
	
	  public Circulo(double raio) {
		    this.raio = raio;
		  }
		  
		  public double obterArea() {
			    return (this.raio * this.raio) * this.pi;
			  }
		  
		  public  double obterPerimetro() {
				
				return this.raio * 2 * this.pi;
			
			}

}
