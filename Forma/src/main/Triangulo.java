package main;

public class Triangulo extends Forma {
	
	private int lado;

	  public Triangulo(int lado) {
	    this.lado = lado;
	  }
	  
	  public double obterArea() {
		    return ((this.lado * this.lado) * 1.732)/4;  //Preferi mais uma vez usar um valor aproximado pra limitar as casas decimais professor, invés de usar o math.squart(3);
		                                                 //Pois estava dando problema na hora de exibição com %2.f
		  }
	  
	  public  double obterPerimetro() {
			
			return this.lado * 3;
		
		}
	  


}
