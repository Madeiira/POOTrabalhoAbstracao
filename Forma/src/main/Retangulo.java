package main;

public class Retangulo extends Forma{

	  private int lado;
	  private int altura;

	  public Retangulo(int lado, int altura) {
	    this.lado = lado;
	    this.altura = altura;
	  }

	  public double obterArea() {
	    return this.lado * this.altura;
	  }
	  
	  public double obterPerimetro() {
		    return (this.lado * 2 ) + ( 2 * this.altura);
	  }
	
}
